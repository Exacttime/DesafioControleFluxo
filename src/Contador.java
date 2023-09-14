import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int primeiroParametro = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        int segundoParametro = scanner.nextInt();
        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo o numero: " + i);
        }
    }
}

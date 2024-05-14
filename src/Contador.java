import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao contador!");

        System.out.println("Digite o primeiro número: ");
        int numeroUm = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int numeroDois = scanner.nextInt();

        scanner.close();

        try {
            contar(numeroUm, numeroDois);
        } catch (ParametroInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int numUm, int numDois) throws ParametroInvalidoException {
        if (numUm > numDois) {
            throw new ParametroInvalidoException("O primeiro número é maior que o segundo");
        } else {
            int contagem = numDois - numUm;
            System.out.println("De " + numUm + " a " + numDois + " são: ");
            for (int i = 1; i <= contagem; i++) {

                System.out.println("contando " + i);
            }
        }

    }
}

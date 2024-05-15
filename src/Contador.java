import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, seja bem vindo ao contador!");

        System.out.println("Digite o primeiro número: ");
        int numeroUm = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int numeroDois = scanner.nextInt();

        scanner.close();

        try {
            contar(numeroUm, numeroDois);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    static void contar(int numUm, int numDois) throws ParametroInvalidoException {
        if (numUm > numDois) {
            throw new ParametroInvalidoException("O primeiro número é maior que o segundo.");
        } else {
            int contagem = numDois - numUm;
            System.out.println("Contando...");
            for (int i = 1; i <= contagem; i++){
                System.out.println("Número " + i);
            }
            System.out.println("Terminou a contagem!");
        }

    }
}

package ExIf;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 5 == 0) {
            System.out.println("O número é múltiplo de 5.");
        }

        scanner.close();
    }
}

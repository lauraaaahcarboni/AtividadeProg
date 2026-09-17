package ExIf;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do cliente: ");
        int idade = scanner.nextInt();

        if (idade >= 60) {
            System.out.println("Cliente possui direito ao desconto.");
        }

        scanner.close();
    }
}

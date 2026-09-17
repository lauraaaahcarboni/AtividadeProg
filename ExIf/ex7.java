package ExIf;

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a média final do aluno: ");
        double media = scanner.nextDouble();

        if (media >= 7.0) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }

        scanner.close();
    }
}

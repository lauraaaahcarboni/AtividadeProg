package fundamentosScanner;

import java.util.Scanner;

public class list1ativ4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.print("Digite a Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a Nota 2: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2.0;

        System.out.println("\nAluno: " + nomeAluno);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);

        scanner.close();

	}

}

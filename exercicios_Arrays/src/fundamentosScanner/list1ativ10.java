package fundamentosScanner;

import java.util.Scanner;

public class list1ativ10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do Aluno: ");
        String aluno = scanner.nextLine();

        System.out.print("Curso: ");
        String curso = scanner.nextLine();

        System.out.print("Idade (apenas número): ");
        int idade = scanner.nextInt();

        System.out.println("==============================");
        System.out.println("Aluno: " + aluno);
        System.out.println("Curso: " + curso);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("==============================");

        scanner.close();

	}

}

package fundamentosScanner;

import java.util.Scanner;

public class list1ativ11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do Aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.print("Nota do Aluno (0 a 10): ");
        int nota = scanner.nextInt();

        System.out.print("Frequência do Aluno (0 a 100): ");
        int frequencia = scanner.nextInt();

        String resultado = (nota >= 6 && frequencia >= 75) ? "Aprovado" : "Reprovado";

        System.out.println("\nBome aluino: " + nomeAluno + "Resultado final no console: " + resultado);

        scanner.close();

	}

}

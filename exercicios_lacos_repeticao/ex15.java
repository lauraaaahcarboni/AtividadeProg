package exercicios_lacos_repeticao;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		// Exercício 15 – Média de notas Peça ao usuário 5 notas. Calcule e exiba: ●  soma das notas; ●  média das notas.

		 Scanner scanner = new Scanner(System.in);

	        double soma = 0.0;

	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Digite a " + i + "ª nota: ");
	            double nota = scanner.nextDouble();
	            soma += nota;
	        }

	        double media = soma / 5;

	        System.out.println("Soma das notas: " + soma);
	        System.out.println("Média das notas: " + media);

	        scanner.close();

	}

}

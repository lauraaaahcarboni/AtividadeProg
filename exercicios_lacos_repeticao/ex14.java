package exercicios_lacos_repeticao;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		// Peça ao usuário um número inteiro positivo N. Calcule a soma de todos os números de 1 até N. 

        	Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número inteiro positivo: ");
	        int n = scanner.nextInt();

	        int soma = 0;

	        for (int i = 1; i <= n; i++) {
	            soma += i;
	        }

	        System.out.println("Soma: " + soma);

	        scanner.close();

	}

}

package exercicios_lacos_repeticao;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		// Somando números (do-while) Crie um programa que peça ao usuário 5 números inteiros. Ao final, exiba a soma de todos os números informados.

		 Scanner scanner = new Scanner(System.in);
	        int soma = 0;
	        int contador = 1;

	        do {
	            System.out.print("Digite o " + contador + "º número: ");
	            int numero = scanner.nextInt();
	            soma += numero;
	            contador++;
	        } while (contador <= 5);

	        System.out.println("Soma total = " + soma);
	        scanner.close();


	}

}

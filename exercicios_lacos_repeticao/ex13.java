package exercicios_lacos_repeticao;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		// Exercício 13 – Tabuada Peça ao usuário um número inteiro e exiba sua tabuada de 1 até 10. 

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Informe um número inteiro para ver sua tabuada: ");
		        int numero = scanner.nextInt();

		        for (int i = 1; i <= 10; i++) {
		            int resultado = numero * i;
		            System.out.println(numero + " x " + i + " = " + resultado);
		        }

		        scanner.close();


	}

}

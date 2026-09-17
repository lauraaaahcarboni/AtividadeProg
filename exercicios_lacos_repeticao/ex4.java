package exercicios_lacos_repeticao;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		//Tabuada (while) Solicite ao usuário um número inteiro através da classe Scanner e exiba sua tabuada de 1 a 10, utilizando um laço while.

		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();

	        int i = 1; // Multiplicador
	        while (i <= 10) {
	            System.out.println(numero + " x " + i + " = " + (numero * i));
	            i++;
	        }

	        scanner.close();


	}

}

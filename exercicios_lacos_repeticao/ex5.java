package exercicios_lacos_repeticao;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		//  Soma até número negativo (while) Escreva um programa que
		//solicite ao usuário através da classe Scanner vários números 
		//inteiros. A leitura deverá continuar enquanto o número informado f
		//or positivo ou zero. Quando o usuário digitar um número negativo, 
		//o programa deverá encerrar a repetição e exibir a soma de todos os valores positivos informados.


		  Scanner scanner = new Scanner(System.in);
	        int soma = 0;

	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();

	        // Continua enquanto o número for positivo ou zero
	        while (numero >= 0) {
	            soma += numero; // Soma o número digitado
	            System.out.print("Digite um número: ");
	            numero = scanner.nextInt(); // Lê o próximo número
	        }

	        System.out.println("Soma = " + soma);
	        scanner.close();

		
	}

}

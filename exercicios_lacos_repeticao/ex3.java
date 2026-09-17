package exercicios_lacos_repeticao;

public class ex3 {

	public static void main(String[] args) {
		//  Soma dos números de 1 a 100 (while) Escreva um programa que calcule e exiba a soma de todos os números inteiros de 1 a 100, utilizando um laço while.

			int i = 1;
	        int soma = 0; // Variável acumuladora

	        while (i <= 100) {
	            soma += i; 
	            i++;
	        }
	        
	        System.out.println("Soma = " + soma);


	}

}

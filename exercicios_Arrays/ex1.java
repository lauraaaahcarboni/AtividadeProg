package exercicios_Arrays;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// Criar um array double de tamanho 5, pedir as notas ao usuário 
		//usando um for tradicional com notas.length, mostrar as notas e 
		//calcular a média. 
		
		Scanner scanner = new Scanner(System.in);
		double[] notas = new double[5];
		double soma = 0;
		
		for (int i = 0; i < notas.length; i++) {
			
		    System.out.print("Informe a nota do aluno " + (i + 1) + ": ");
		    notas[i] = scanner.nextDouble();
		    soma += notas[i]; 
		    
		}
		
		System.out.println("\n--- Notas Informadas ---");
		for (int i = 0; i < notas.length; i++) {
		    System.out.println("Nota " + (i + 1) + ": " + notas[i]);
		}
		
		double media = soma / notas.length;
		System.out.println("Média da turma: " + media);






	}

}

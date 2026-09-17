package exercicios_Arrays;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// criar uma matriz do tipo double com 3 linhas 
		//(representando 3 alunos) e 4 colunas 
		//(representando 4 avaliações para cada aluno). 
		
		Scanner scanner = new Scanner(System.in);
		double[][] notas = new double[3][4];

		for (int i = 0; i < notas.length; i++) {
			
		    System.out.println("Digite as notas do Aluno " + (i + 1) + ":");
		    
		    for (int j = 0; j < notas[i].length; j++) {
		        System.out.print("  Nota da Avaliação " + (j + 1) + ": ");
		        notas[i][j] = scanner.nextDouble();
		    }
		}

		System.out.println("\n--- Notas dos Alunos ---");
		for (int i = 0; i < notas.length; i++) {
		    System.out.print("Aluno " + (i + 1) + ": ");
		    for (int j = 0; j < notas[i].length; j++) {
		        System.out.print(notas[i][j] + " ");
		    }
		    System.out.println(); 

		   }
		scanner.close();


	}

}

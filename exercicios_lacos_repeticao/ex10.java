package exercicios_lacos_repeticao;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// Crie um programa que permita ao usuário informar as notas de vários alunos. 
		//Para cada aluno, informe: 
		//	●  nome; ●  nota. 
		//	Após cadastrar cada aluno, pergunte: 
		//	Deseja cadastrar outro aluno? (S/N) 
		//	O programa deve continuar enquanto o usuário responder S. 
		//	Ao final, exiba a média das notas informadas. 


		 Scanner scanner = new Scanner(System.in);
	        
	        double somaNotas = 0.0;
	        int quantidadeAlunos = 0;
	        char resposta;

	        do {
	            System.out.print("Informe o nome do aluno: ");
	            String nome = scanner.next();

	            System.out.print("Informe a nota do aluno: ");
	            double nota = scanner.nextDouble();

	            somaNotas += nota;
	            quantidadeAlunos++;

	            System.out.print("Deseja cadastrar outro aluno? (S/N): ");
	            resposta = scanner.next().toUpperCase().charAt(0);
	            System.out.println();

	        } while (resposta == 'S');

	        if (quantidadeAlunos > 0) {
	            double media = somaNotas / quantidadeAlunos;
	            System.out.printf("Média das notas informadas: %.2f%n", media);
	        } else {
	            System.out.println("Nenhum aluno foi cadastrado.");
	        }

	        scanner.close();

	}

}

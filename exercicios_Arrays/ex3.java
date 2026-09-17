package exercicios_Arrays;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// criarmos um programa que armazene os nomes de 8 alunos em um array 
		//do tipo String. Depois, ele solicita ao usuário o nome de um aluno 
		//para pesquisar e deve mostrar se foi encontrado (informando a posição) ou se não foi encontrado.
		
		Scanner scanner = new Scanner(System.in);
		String[] alunos = {"Ana Irda", "Bruno", "Maria", "Sofia", "Nicolau", "Melissa", "Nina", "Belinha"};

		System.out.print("Digite o nome do aluno para pesquisar: ");
		String pesquisa = scanner.nextLine();
		int posicao = -1;
		
		for (int i = 0; i < alunos.length; i++) {
		    if (alunos[i].equalsIgnoreCase(pesquisa)) {
		        posicao = i; 
		        break;       
		    }
		}

		if (posicao != -1) {
		    System.out.println("Aluno encontrado na posição: " + posicao);
		} else {
		    System.out.println("Aluno não encontrado.");
		}
		scanner.close();




	}

}

package exercicios_lacos_repeticao;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		//Crie um programa que apresente o seguinte menu: 
		//===== MENU ===== 1 - Cadastrar 2 - Consultar 3 - Excluir 0 - Sair 
		//O programa deve continuar exibindo o menu até que o usuário escolha a opção 0. 
		//Quando isso acontecer, exiba: Programa encerrado. 

		 Scanner scanner = new Scanner(System.in);
	        int opcao;

	        do {
	            System.out.println("===== MENU =====");
	            System.out.println("1 - Cadastrar");
	            System.out.println("2 - Consultar");
	            System.out.println("3 - Excluir");
	            System.out.println("0 - Sair");
	            System.out.print("Escolha uma opção: ");
	            
	            opcao = scanner.nextInt();

	            switch (opcao) {
	                case 1:
	                    System.out.println("Opção Cadastrar selecionada.");
	                    break;
	                case 2:
	                    System.out.println("Opção Consultar selecionada.");
	                    break;
	                case 3:
	                    System.out.println("Opção Excluir selecionada.");
	                    break;
	                case 0:
	                    System.out.println("Programa encerrado.");
	                    break;
	                default:
	                    System.out.println("Opção inválida! Tente novamente.");
	                    break;
	            }
	            System.out.println(); // Linha em branco para organizar a exibição
	        } while (opcao != 0);

	        scanner.close();


	}

}

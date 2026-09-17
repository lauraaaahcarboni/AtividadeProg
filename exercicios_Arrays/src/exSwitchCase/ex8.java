package exSwitchCase;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Escolha a Sala de Cinema (1 ou 2):");
	        System.out.print("Sala: ");
	        int sala = scanner.nextInt();
	        
	        switch (sala) {
	            case 1:
	                System.out.println("\nFilmes disponíveis na Sala 1:");
	                System.out.println("1 → Aventura");
	                System.out.println("2 → Comédia");
	                System.out.println("3 → Ficção Científica");
	                System.out.print("Escolha o filme: ");
	                int filmeSala1 = scanner.nextInt();
	                
	                switch (filmeSala1) {
	                    case 1: System.out.println("Filme selecionado: Aventura"); break;
	                    case 2: System.out.println("Filme selecionado: Comédia"); break;
	                    case 3: System.out.println("Filme selecionado: Ficção Científica"); break;
	                    default: System.out.println("Filme inválido.");
	                }
	                break;
	                
	            case 2:
	                System.out.println("\nFilmes disponíveis na Sala 2:");
	                System.out.println("1 → Terror");
	                System.out.println("2 → Romance");
	                System.out.println("3 → Animação");
	                System.out.print("Escolha o filme: ");
	                int filmeSala2 = scanner.nextInt();
	                
	                switch (filmeSala2) {
	                    case 1: System.out.println("Filme selecionado: Terror"); break;
	                    case 2: System.out.println("Filme selecionado: Romance"); break;
	                    case 3: System.out.println("Filme selecionado: Animação"); break;
	                    default: System.out.println("Filme inválido.");
	                }
	                break;
	                
	            default:
	                System.out.println("Sala inválida.");
	        }
	        
	        scanner.close();

	}

}

package exSwitchCase;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Escolha o Turno:");
	        System.out.println("1 → Manhã");
	        System.out.println("2 → Tarde");
	        System.out.print("Turno: ");
	        int turno = scanner.nextInt();
	        
	        switch (turno) {
	            case 1: // Manhã
	                System.out.println("\nDisciplinas da Manhã:");
	                System.out.println("1 → Matemática");
	                System.out.println("2 → Português");
	                System.out.println("3 → Física");
	                System.out.print("Escolha a disciplina: ");
	                int discManha = scanner.nextInt();
	                
	                switch (discManha) {
	                    case 1: System.out.println("Disciplina selecionada: Matemática"); break;
	                    case 2: System.out.println("Disciplina selecionada: Português"); break;
	                    case 3: System.out.println("Disciplina selecionada: Física"); break;
	                    default: System.out.println("Disciplina inválida.");
	                }
	                break;
	                
	            case 2: // Tarde
	                System.out.println("\nDisciplinas da Tarde:");
	                System.out.println("1 → História");
	                System.out.println("2 → Geografia");
	                System.out.println("3 → Biologia");
	                System.out.print("Escolha a disciplina: ");
	                int discTarde = scanner.nextInt();
	                
	                switch (discTarde) {
	                    case 1: System.out.println("Disciplina selecionada: História"); break;
	                    case 2: System.out.println("Disciplina selecionada: Geografia"); break;
	                    case 3: System.out.println("Disciplina selecionada: Biologia"); break;
	                    default: System.out.println("Disciplina inválida.");
	                }
	                break;
	                
	            default:
	                System.out.println("Turno inválido.");
	        }
	        
	        scanner.close();

	}

}

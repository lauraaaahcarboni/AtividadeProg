package exSwitchCase;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        
		 System.out.print("Digite a letra do conceito do aluno (A, B, C, D ou F): ");
	        char conceito = scanner.next().toUpperCase().charAt(0);
	        
	        switch (conceito) {
	            case 'A':
	                System.out.println("Excelente");
	                break;
	            case 'B':
	                System.out.println("Bom");
	                break;
	            case 'C':
	                System.out.println("Regular");
	                break;
	            case 'D':
	                System.out.println("Insuficiente");
	                break;
	            case 'F':
	                System.out.println("Reprovado");
	                break;
	            default:
	                System.out.println("Conceito inválido.");
	        }
	        
	        scanner.close();

	}

}

package exSwitchCase;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        
		 System.out.println("--- CARDÁPIO ---");
	        System.out.println("1 - Cachorro-quente\n2 - Hambúrguer\n3 - Pizza\n4 - Refrigerante\n5 - Suco");
	        System.out.print("Digite o código do produto desejado: ");
	        int codigo = scanner.nextInt();
	        
	        switch (codigo) {
	            case 1:
	                System.out.println("Produto: Cachorro-quente");
	                break;
	            case 2:
	                System.out.println("Produto: Hambúrguer");
	                break;
	            case 3:
	                System.out.println("Produto: Pizza");
	                break;
	            case 4:
	                System.out.println("Produto: Refrigerante");
	                break;
	            case 5:
	                System.out.println("Produto: Suco");
	                break;
	            default:
	                System.out.println("Produto inválido.");
	        }
	        
	        scanner.close();

	}

}

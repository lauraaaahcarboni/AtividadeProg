package exSwitchCase;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Escolha o Setor da Lanchonete:");
	        System.out.println("1 → Bebidas");
	        System.out.println("2 → Lanches");
	        System.out.print("Setor: ");
	        int setor = scanner.nextInt();
	        
	        switch (setor) {
	            case 1: // Bebidas
	                System.out.println("\nMenu de Bebidas:");
	                System.out.println("1 → Água");
	                System.out.println("2 → Refrigerante");
	                System.out.println("3 → Suco");
	                System.out.print("Escolha a bebida: ");
	                int bebida = scanner.nextInt();
	                
	                switch (bebida) {
	                    case 1: System.out.println("Item selecionado: Água"); break;
	                    case 2: System.out.println("Item selecionado: Refrigerante"); break;
	                    case 3: System.out.println("Item selecionado: Suco"); break;
	                    default: System.out.println("Bebida inválida.");
	                }
	                break;
	                
	            case 2: // Lanches
	                System.out.println("\nMenu de Lanches:");
	                System.out.println("1 → Cachorro-quente");
	                System.out.println("2 → Hambúrguer");
	                System.out.println("3 → Pizza");
	                System.out.print("Escolha o lanche: ");
	                int lanche = scanner.nextInt();
	                
	                switch (lanche) {
	                    case 1: System.out.println("Item selecionado: Cachorro-quente"); break;
	                    case 2: System.out.println("Item selecionado: Hambúrguer"); break;
	                    case 3: System.out.println("Item selecionado: Pizza"); break;
	                    default: System.out.println("Lanche inválido.");
	                }
	                break;
	                
	            default:
	                System.out.println("Setor inválido.");
	        }
	        
	        scanner.close();

	}

}

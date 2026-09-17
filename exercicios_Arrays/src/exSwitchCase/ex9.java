package exSwitchCase;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        
		 System.out.println("Categorias da Loja:");
	        System.out.println("1 → Informática");
	        System.out.println("2 → Telefonia");
	        System.out.print("Escolha a categoria: ");
	        int categoria = scanner.nextInt();
	        
	        switch (categoria) {
	            case 1:
	                System.out.println("\nProdutos de Informática:");
	                System.out.println("1 → Notebook");
	                System.out.println("2 → Mouse");
	                System.out.println("3 → Teclado");
	                System.out.print("Escolha o produto: ");
	                int prodInfo = scanner.nextInt();
	                
	                switch (prodInfo) {
	                    case 1: System.out.println("Produto selecionado: Notebook"); break;
	                    case 2: System.out.println("Produto selecionado: Mouse"); break;
	                    case 3: System.out.println("Produto selecionado: Teclado"); break;
	                    default: System.out.println("Produto inválido.");
	                }
	                break;
	                
	            case 2:
	                System.out.println("\nProdutos de Telefonia:");
	                System.out.println("1 → Smartphone");
	                System.out.println("2 → Carregador");
	                System.out.println("3 → Fone de ouvido");
	                System.out.print("Escolha o produto: ");
	                int prodTelefonia = scanner.nextInt();
	                
	                switch (prodTelefonia) {
	                    case 1: System.out.println("Produto selecionado: Smartphone"); break;
	                    case 2: System.out.println("Produto selecionado: Carregador"); break;
	                    case 3: System.out.println("Produto selecionado: Fone de ouvido"); break;
	                    default: System.out.println("Produto inválido.");
	                }
	                break;
	                
	            default:
	                System.out.println("Categoria inválida.");
	        }
	        
	        scanner.close();
	}

}

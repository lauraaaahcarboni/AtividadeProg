package fundamentosScanner;

import java.util.Scanner;

public class list1Ativ2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o nome do produto: ");
	        String nomeProduto = scanner.nextLine();

	        System.out.print("Digite o código do produto: ");
	        String codigo = scanner.nextLine();

	        System.out.print("Digite o preço do produto: ");
	        double preco = scanner.nextDouble();

	        System.out.print("Digite a quantidade em estoque: ");
	        int quantidadeEstoque = scanner.nextInt();

	        System.out.println("\n--- Dados do Produto Cadastrado ---");
	        System.out.println("Produto: " + nomeProduto + "\nCódigo: " + codigo + "\nPreço: R$ " + preco + "\nEstoque: " + quantidadeEstoque + " unidades");

	        scanner.close();

	}

}

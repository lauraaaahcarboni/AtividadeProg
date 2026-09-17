package fundamentosScanner;

import java.util.Scanner;

public class list2Atv15 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String produto;
		double preco;
		int estoque;

		System.out.println("Nome do produto:");
		produto = leia.nextLine();

		System.out.println("Preço:");
		preco = leia.nextDouble();

		System.out.println("Estoque:");
		estoque = leia.nextInt();

		System.out.println("=========================");
		System.out.println("Produto: " + produto);
		System.out.println("Preço: R$ " + preco);
		System.out.println("Estoque: " + estoque + " unidades");
		System.out.println("=========================");

		leia.close();
	}

}
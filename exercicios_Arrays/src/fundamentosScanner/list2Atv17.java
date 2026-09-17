package fundamentosScanner;

import java.util.Scanner;

public class list2Atv17 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int estoque;
		String situacao;

		System.out.println("Quantidade em estoque:");
		estoque = leia.nextInt();

		situacao = (estoque < 5) ? "Estoque baixo" : "Estoque suficiente";

		System.out.println(situacao);

		leia.close();
	}

}
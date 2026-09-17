package fundamentosScanner;

import java.util.Scanner;

public class list2Atv9 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int x, y;
		int divInt;
		double divFlut;

		System.out.println("Digite x:");
		x = leia.nextInt();

		System.out.println("Digite y:");
		y = leia.nextInt();

		divInt = x / y;
		divFlut = (double) x / y;

		System.out.println("Divisão inteira: " + divInt);
		System.out.println("Divisão em ponto flutuante: " + divFlut);
		leia.close();

	}

}
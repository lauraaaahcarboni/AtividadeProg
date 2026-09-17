package fundamentosScanner;

import java.util.Scanner;

public class list2Atv5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double c, f;

		System.out.println("Temperatura em Celsius:");
		c = leia.nextDouble();

		f = (c * 9 / 5) + 32;

		System.out.println("Temperatura em Fahrenheit: " + f);
		
		leia.close();

	}

}
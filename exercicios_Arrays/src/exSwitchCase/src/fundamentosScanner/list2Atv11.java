package fundamentosScanner;

import java.util.Scanner;

public class list2Atv11 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double temperatura;

		System.out.println("Digite a temperatura:");
		temperatura = leia.nextDouble();

		System.out.println(temperatura > 25);
		System.out.println(temperatura <= 30);
		System.out.println(temperatura == 20);
		System.out.println(temperatura != 30);
		
		leia.close();

	}

}
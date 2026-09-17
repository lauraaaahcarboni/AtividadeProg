package fundamentosScanner;

import java.util.Scanner;

public class list2Atv6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double km, m;

		System.out.println("Distância em quilômetros:");
		km = leia.nextDouble();

		m = km * 1000;

		System.out.println("Distância em metros: " + m);
		
		leia.close();
	}

}
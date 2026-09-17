package fundamentosScanner;

import java.util.Scanner;

public class list2Atv8 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double temp;
		int tempInt;
		double tempDouble;

		System.out.println("Digite a temperatura:");
		temp = leia.nextDouble();

		tempInt = (int) temp;
		tempDouble = tempInt;

		System.out.println("Temperatura original: " + temp);
		System.out.println("Temperatura convertida para int: " + tempInt);
		System.out.println("Temperatura convertida de volta para double: " + tempDouble);
		leia.close();

	}

}
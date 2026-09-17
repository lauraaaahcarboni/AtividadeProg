package fundamentosScanner;

import java.util.Scanner;

public class list2Atv12 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double saldo;

		System.out.println("Digite o saldo:");
		saldo = leia.nextDouble();

		System.out.println(saldo >= 1000);
		System.out.println(saldo < 500);
		System.out.println(saldo == 850);
		System.out.println(saldo != 850);
		
		leia.close();

	}

}
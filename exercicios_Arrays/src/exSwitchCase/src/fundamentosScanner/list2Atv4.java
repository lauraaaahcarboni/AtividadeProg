package fundamentosScanner;

import java.util.Scanner;

public class list2Atv4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double n1, n2, n3, soma, media;

		System.out.println("Nota 1:");
		n1 = leia.nextDouble();

		System.out.println("Nota 2:");
		n2 = leia.nextDouble();

		System.out.println("Nota 3:");
		n3 = leia.nextDouble();

		soma = n1 + n2 + n3;
		media = soma / 3;

		System.out.println("Soma das notas: " + soma);
		System.out.println("Média final: " + media);
		
		leia.close();

	}

}
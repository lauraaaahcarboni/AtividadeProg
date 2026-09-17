package fundamentosScanner;

import java.util.Scanner;

public class list2Atv10 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int totalAlunos, grupos;
		int divInt;
		double divFlut;

		System.out.println("Total de alunos:");
		totalAlunos = leia.nextInt();

		System.out.println("Quantidade de grupos:");
		grupos = leia.nextInt();

		divInt = totalAlunos / grupos;
		divFlut = (double) totalAlunos / grupos;

		System.out.println("Divisão inteira: " + divInt);
		System.out.println("Divisão em ponto flutuante: " + divFlut);
		
		leia.close();

	}

}
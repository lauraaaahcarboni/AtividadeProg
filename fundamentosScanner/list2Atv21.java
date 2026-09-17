package fundamentosScanner;

import java.util.Scanner;

public class list2Atv21 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String nome;
		double salBase, hrExtras, valorHrExtras, salFinal;

		System.out.println("Nome do funcionário:");
		nome = leia.nextLine();

		System.out.println("Salário base:");
		salBase = leia.nextDouble();

		System.out.println("Quantidade de horas extras:");
		hrExtras = leia.nextDouble();

		valorHrExtras = hrExtras * 35;
		salFinal = salBase + valorHrExtras;

		System.out.println("Nome: " + nome);
		System.out.println("Salário base: R$ " + salBase);
		System.out.println("Valor das horas extras: R$ " + valorHrExtras);
		System.out.println("Salário final: R$ " + salFinal);
		
		leia.close();

	}

}
package fundamentosScanner;

import java.util.Scanner;

public class list2Atv16 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String nome, cargo;
		double salario;

		System.out.println("Nome do funcionário:");
		nome = leia.nextLine();

		System.out.println("Cargo:");
		cargo = leia.nextLine();

		System.out.println("Salário:");
		salario = leia.nextDouble();

		System.out.println("*************************");
		System.out.println("Funcionário: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.println("Salário: R$ " + salario);
		System.out.println("*************************");
		
		leia.close();

	}

}
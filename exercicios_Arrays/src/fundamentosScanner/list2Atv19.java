package fundamentosScanner;

import java.util.Scanner;

public class list2Atv19 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double saldo;
		String situacao;

		System.out.println("Digite o saldo:");
		saldo = leia.nextDouble();

		situacao = (saldo > 0) ? "Saldo positivo" : "Saldo negativo";

		System.out.println("Saldo: R$ " + saldo);
		System.out.println("Situação: " + situacao);
		leia.close();

	}

}
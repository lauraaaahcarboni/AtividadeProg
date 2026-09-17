package fundamentosScanner;

import java.util.Scanner;

public class list2Atv22 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String prod;
		double vUnit, vTotal, vParc;
		int qtd, parc;

		System.out.println("Nome do produto:");
		prod = leia.nextLine();

		System.out.println("Valor unitário:");
		vUnit = leia.nextDouble();

		System.out.println("Quantidade comprada:");
		qtd = leia.nextInt();

		System.out.println("Quantidade de parcelas:");
		parc = leia.nextInt();

		vTotal = vUnit * qtd;
		vParc = vTotal / parc;

		System.out.println("Produto: " + prod);
		System.out.println("Valor unitário: R$ " + vUnit);
		System.out.println("Quantidade comprada: " + qtd);
		System.out.println("Valor total: R$ " + vTotal);
		System.out.println("Quantidade de parcelas: " + parc);
		System.out.println("Valor de cada parcela: R$ " + vParc);

		leia.close();
	}

}
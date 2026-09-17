package fundamentosScanner;

import java.util.Scanner;

public class list2Atv18 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double media;
		String situacao;

		System.out.println("Digite a média:");
		media = leia.nextDouble();

		situacao = (media >= 7) ? "Aprovado" : "Reprovado";

		System.out.println(situacao);
		
		leia.close();

	}

}
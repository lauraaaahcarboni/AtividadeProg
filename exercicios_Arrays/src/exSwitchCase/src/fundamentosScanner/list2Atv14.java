package fundamentosScanner;

import java.util.Scanner;

public class list2Atv14 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		boolean chovendo, guardaChuva, carroDisponivel;

		System.out.println("Está chovendo (true/false)?");
		chovendo = leia.nextBoolean();

		System.out.println("Possui guarda-chuva (true/false)?");
		guardaChuva = leia.nextBoolean();

		System.out.println("Carro disponível (true/false)?");
		carroDisponivel = leia.nextBoolean();

		System.out.println("chovendo: " + chovendo);
		System.out.println("guardaChuva: " + guardaChuva);
		System.out.println("carroDisponivel: " + carroDisponivel);

		System.out.println(chovendo && guardaChuva);

		System.out.println(guardaChuva || carroDisponivel);
		
		System.out.println(!chovendo);

		System.out.println(chovendo && (guardaChuva || carroDisponivel));

		System.out.println(!(chovendo && guardaChuva));
		
		leia.close();

	}

}
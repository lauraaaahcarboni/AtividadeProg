package fundamentosScanner;

import java.util.Scanner;

public class list2Atv3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double dist, lit, media, lit100;

		System.out.println("Distância percorrida (km):");
		dist = leia.nextDouble();

		System.out.println("Litros consumidos:");
		lit = leia.nextDouble();

		media = dist / lit;
		lit100 = 100 / media;

		System.out.println("Consumo médio: " + media + " km/l");
		System.out.println("Litros para 100km: " + lit100);

		leia.close();
	}

}
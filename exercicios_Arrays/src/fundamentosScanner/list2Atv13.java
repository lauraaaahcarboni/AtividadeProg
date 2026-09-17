package fundamentosScanner;

import java.util.Scanner;

public class list2Atv13 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		boolean possuiCNH, possuiCarro, possuiDinheiro;

		System.out.println("Possui CNH (true/false)?");
		possuiCNH = leia.nextBoolean();

		System.out.println("Possui carro (true/false)?");
		possuiCarro = leia.nextBoolean();

		System.out.println("Possui dinheiro (true/false)?");
		possuiDinheiro = leia.nextBoolean();

		// && (E) só dá true se os dois lados forem true
		System.out.println(possuiCNH && possuiCarro);

		// || (OU) dá true se pelo menos um dos dois for true
		System.out.println(possuiCarro || possuiDinheiro);

		// ! inverte o valor, transforma true em false e vice-versa
		System.out.println(!possuiCNH);

		// && exige os dois true pra dar true
		System.out.println(possuiCNH && possuiDinheiro);

		// primeiro resolve o || de dentro dos parênteses, depois o ! inverte o resultado
		System.out.println(!(possuiCarro || possuiDinheiro));
		
		leia.close();

	}

}
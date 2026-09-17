package fundamentosScanner;

import java.util.Scanner;

public class list1ativ9 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Possui ingresso? (true/false): ");
	        boolean possuiIngresso = scanner.nextBoolean();

	        System.out.print("Possui documento de identidade? (true/false): ");
	        boolean possuiDocumento = scanner.nextBoolean();

	        System.out.print("Está acompanhado de maior de idade? (true/false): ");
	        boolean acompanhanteMaiorIdade = scanner.nextBoolean();

	        System.out.println("\n--- Análise das Expressões ---");

	        boolean r1 = possuiIngresso && possuiDocumento;
	        System.out.println("possuiIngresso && possuiDocumento -> " + r1);
	       

	        boolean r2 = possuiIngresso || possuiDocumento;
	        System.out.println("possuiIngresso || possuiDocumento -> " + r2);

	        boolean r3 = !possuiDocumento;
	        System.out.println("!possuiDocumento -> " + r3);

	        boolean r4 = possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade);
	        System.out.println("possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade) -> " + r4);

	        boolean r5 = !(possuiIngresso && possuiDocumento);
	        System.out.println("!(possuiIngresso && possuiDocumento) -> " + r5);

	        scanner.close();

	}

}

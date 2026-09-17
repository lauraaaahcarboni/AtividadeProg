package fundamentosScanner;

import java.util.Scanner;

public class list1ativ8 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o valor inteiro de numA (sugerido: 7): ");
	        int numA = scanner.nextInt();

	        System.out.print("Digite o valor inteiro de numB (sugerido: 2): ");
	        int numB = scanner.nextInt();

	        int divisaoInteira = numA / numB;

	        double divisaoPontoFlutuante = (double) numA / numB;

	        System.out.println("\nDivisão inteira: " + divisaoInteira);
	        System.out.println("Divisão em ponto flutuante: " + divisaoPontoFlutuante);

	        scanner.close();

	}

}

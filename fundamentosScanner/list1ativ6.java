package fundamentosScanner;

import java.util.Scanner;

public class list1ativ6 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o valor do monitor em dólares (sugerido: 75): ");
	        double valorEmDolares = scanner.nextDouble();

	        System.out.print("Digite a cotação do dólar hoje (sugerido: 5,62): ");
	        double cotacaoDolar = scanner.nextDouble();

	        double valorEmReais = valorEmDolares * cotacaoDolar;

	        System.out.printf("O monitor custa %.2f reais\n", valorEmReais);

	        scanner.close();

	}

}

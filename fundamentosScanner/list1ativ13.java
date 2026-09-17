package fundamentosScanner;

import java.util.Scanner;

public class list1ativ13 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a temperatura atual em °C: ");
	        double temperatura = scanner.nextDouble();

	        String situacao = (temperatura > 25) ? "Dia quente" : "Dia agradável";

	        System.out.println("\n- Temperatura: " + temperatura + "°C");
	        System.out.println("- Situação: " + situacao);

	        scanner.close();

	}

}

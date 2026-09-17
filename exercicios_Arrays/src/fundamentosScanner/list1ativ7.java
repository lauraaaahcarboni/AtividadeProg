package fundamentosScanner;

import java.util.Scanner;

public class list1ativ7 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o salário completo (ex: 3875,90): ");
	        double salario = scanner.nextDouble();

	        int salarioInteiro = (int) salario;

	        double salarioConvertidoVolta = (double) salarioInteiro;

	        System.out.println("\n--- Valores Resultantes ---");
	        System.out.println("Valor original (double): " + salario);
	        System.out.println("Apenas a parte inteira (int): " + salarioInteiro);
	        System.out.println("Convertido novamente (double): " + salarioConvertidoVolta);

	        scanner.close();

	}

}

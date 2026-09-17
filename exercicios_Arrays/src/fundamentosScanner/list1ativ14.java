package fundamentosScanner;

import java.util.Scanner;

public class list1ativ14 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o nome do funcionário: ");
	        String nome = scanner.nextLine();

	        System.out.print("Digite o salário atual: R$ ");
	        double salario = scanner.nextDouble();

	        System.out.print("Digite o tempo de empresa (em anos completos): ");
	        int tempoEmpresa = scanner.nextInt();

	        double bonus = (tempoEmpresa >= 5) ? 500.0 : 0.0;
	        
	        double salarioFinal = salario + bonus;

	        System.out.println("\nNome: " + nome);
	        System.out.println("Salário: R$ " + salario);
	        System.out.println("Bônus: R$ " + bonus);
	        System.out.println("Salário Final: R$ " + salarioFinal);

	        scanner.close();

	}

}

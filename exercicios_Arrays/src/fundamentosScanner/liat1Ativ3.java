package fundamentosScanner;

import java.util.Scanner;

public class liat1Ativ3 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro número inteiro: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Digite o segundo número inteiro: ");
	        int num2 = scanner.nextInt();

	        int soma = num1 + num2;
	        int subtracao = num1 - num2;
	        int multiplicacao = num1 * num2;
	        
	        String divisao = (num2 != 0) ? String.valueOf(num1 / num2) : "Impossível dividir por zero";
	        String resto = (num2 != 0) ? String.valueOf(num1 % num2) : "Não há resto (divisão por zero)";

	        System.out.println("\n--- Resultados ---");
	        System.out.println("Soma: " + soma);
	        System.out.println("Subtração: " + subtracao);
	        System.out.println("Multiplicação: " + multiplicacao);
	        System.out.println("Divisão: " + divisao);
	        System.out.println("Resto da divisão: " + resto);

	        scanner.close();

	}

}

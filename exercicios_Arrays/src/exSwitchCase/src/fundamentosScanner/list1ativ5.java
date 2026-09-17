package fundamentosScanner;

import java.util.Scanner;

public class list1ativ5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // O preço sugerido esta na propria questao :)
        System.out.print("Digite o valor do arroz (sugerido: 27,90): ");
        double arroz = scanner.nextDouble();

        System.out.print("Digite o valor do feijão (sugerido: 9,80): ");
        double feijao = scanner.nextDouble();

        System.out.print("Digite o valor do óleo (sugerido: 8,50): ");
        double oleo = scanner.nextDouble();

        double valorTotal = arroz + feijao + oleo;
        double valorMedio = valorTotal / 3.0;

        System.out.println("\n--- Fechamento de Compra ---");
        System.out.println("Valor total da compra: R$ " + valorTotal);
        System.out.println("Valor médio dos produtos: R$ " + valorMedio);

        scanner.close();

	}

}

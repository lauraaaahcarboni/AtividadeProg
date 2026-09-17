package fundamentosScanner;

import java.util.Scanner;

public class list2Atv2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String marca, modelo, cor;
		int ano;
		double valor;
		boolean automatico;

		System.out.println("Qual a marca do veiculo?");
		marca = leia.nextLine();

		System.out.println("Qual o modelo do veculo?");
		modelo = leia.nextLine();

		System.out.println("Qual o ano de fabricação?");
		ano = leia.nextInt();

		leia.nextLine(); 

		System.out.println("Qual a cor do veculo?");
		cor = leia.nextLine();

		System.out.println("Qual o valor do veiculo?");
		valor = leia.nextDouble();

		System.out.println("O veículo é automático (true/false)?");
		automatico = leia.nextBoolean();

		System.out.println("\n--- Dados do veiculo ---");
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano de fabricação: " + ano);
		System.out.println("Cor: " + cor);
		System.out.println("Valor: " + valor);
		System.out.println("Automatico: " + automatico);
		
		leia.close();

	}

}
package fundamentosScanner;

import java.util.Scanner;

public class list2Atv20 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int idade;
		String atendimento;

		System.out.println("Digite a idade:");
		idade = leia.nextInt();

		atendimento = (idade >= 60) ? "Atendimento preferencial" : "Atendimento comum";

		System.out.println("Idade: " + idade + " anos");
		System.out.println("Tipo de atendimento: " + atendimento);
		
		leia.close();

	}

}
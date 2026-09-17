package exercicios_lacos_repeticao;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// Senha (do-while) Crie um programa que peça ao usuário uma senha. A senha correta é 1234. O programa deve continuar solicitando a senha enquanto o usuário não informar a senha correta. Quando acertar, exiba: "Senha correta! Acesso permitido."

		 Scanner scanner = new Scanner(System.in);
	        int senha;

	        do {
	            System.out.print("Digite a senha: ");
	            senha = scanner.nextInt();
	        } while (senha != 1234); // Repete se a senha for diferente de 1234

	        System.out.println("Senha correta!");
	        System.out.println("Acesso permitido.");

	        scanner.close();


	}

}

package exercicios_lacos_repeticao;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de início: ");
        int inicio = scanner.nextInt();
        
        System.out.print("Digite o número de finalização: ");
        int fim = scanner.nextInt();
        
        int i = inicio;
        
        // Usamos do-while porque ele garante que o bloco roda pelo menos uma vez antes de testar a condição.
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= fim);
        
        scanner.close();


	}

}

package exercicios_Arrays;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// criarmos um programa que armazene 10 números inteiros em um array. Depois de preenchê-lo, o programa deve:
		//Mostrar todos os valores.
		//Identificar o maior número.
		//Identificar o menor número.
		//Informar em qual posição (índice) do array cada um deles foi encontrado.

		Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10]; 

        // 1. Preenchendo o array com os valores digitados pelo usuário
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }
        
        // 2. Mostrando todos os valores armazenados
        System.out.print("\nValores: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        // 3. O "chute inicial": assumimos que o primeiro elemento (posição 0) é o maior e o menor
        int maior = numeros[0];
        int posMaior = 0;
        
        int menor = numeros[0];
        int posMenor = 0;
        
        // 4. Percorrendo o array a partir do índice 1 para comparar com o restante
        for (int i = 1; i < numeros.length; i++) {
            
            if (numeros[i] > maior) {
                maior = numeros[i]; 
                posMaior = i;      
            }
            
            
            if (numeros[i] < menor) {
                menor = numeros[i]; 
                posMenor = i;      
            }
        }
        
        System.out.println("Maior valor: " + maior);
        System.out.println("Posição do maior: " + posMaior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Posição do menor: " + posMenor);
        
        scanner.close();
    }
}

	



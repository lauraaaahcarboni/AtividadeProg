package exercicios_Arrays;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// O programa deve criar uma matriz de números inteiros de tamanho 4 × 4, preenchê-la e calcular:
		//A soma de todos os elementos;
		//A média dos elementos;
		//O maior elemento;
		//O menor elemento;
		//Apresentar a matriz e os resultados finais na tela usando matriz.length e matriz[i].length.

		        Scanner scanner = new Scanner(System.in);
		        int[][] matriz = new int[4][4];
		      
		        for (int i = 0; i < matriz.length; i++) {
		            for (int j = 0; j < matriz[i].length; j++) {
		                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
		                matriz[i][j] = scanner.nextInt();
		            }
		        }
		        
		        int soma = 0;
		        int maior = matriz[0][0];
		        int menor = matriz[0][0];
		        
		        System.out.println("\n--- Matriz Informada ---");
		        for (int i = 0; i < matriz.length; i++) {
		            for (int j = 0; j < matriz[i].length; j++) {
		                int valorAtual = matriz[i][j];  
		                soma += valorAtual;

		                if (valorAtual > maior) {
		                    maior = valorAtual;
		                }
		                if (valorAtual < menor) {
		                    menor = valorAtual;
		               }
		                // O \t adiciona um tab na exibição para alinhar as colunas
		                System.out.print(valorAtual + "\t");
		            }
		            System.out.println(); 
		        }
		        
		        
		        int totalElementos = matriz.length * matriz[0].length;
		        double media = (double) soma / totalElementos;
		       
		        
		        System.out.println("\nSoma de todos os elementos: " + soma);
		        System.out.println("Média dos elementos: " + media);
		        System.out.println("Maior elemento: " + maior);
		        System.out.println("Menor elemento: " + menor);
		        scanner.close();
		    }
		}


	



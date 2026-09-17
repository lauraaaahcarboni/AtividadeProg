package exercicios_Arrays;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int[][] estoque = new int[3][4];

        for (int i = 0; i < estoque.length; i++) {
            System.out.println("--- Digite os dados do Produto " + (i + 1) + " ---");
            for (int j = 0; j < estoque[i].length; j++) {
                System.out.print("Período " + (j + 1) + ": ");
                estoque[i][j] = scanner.nextInt();
            }
        }

        int estoqueGeral = 0;
        int maiorEstoque = -1;
        int produtoMaior = -1;

        System.out.println("\n--- RELATÓRIO DE ESTOQUE ---");
        
        for (int i = 0; i < estoque.length; i++) {
            int somaProduto = 0; // Zera a soma a cada novo produto

            for (int j = 0; j < estoque[i].length; j++) {
                somaProduto += estoque[i][j]; // Soma as colunas do produto atual
            }

            System.out.println("Produto " + (i + 1) + ": " + somaProduto + " unidades");

            // Acumula no total da loja
            estoqueGeral += somaProduto;

            // Verifica se este produto tem o maior estoque acumulado
            if (somaProduto > maiorEstoque) {
                maiorEstoque = somaProduto;
                produtoMaior = i + 1;
            }
        }

        System.out.println("\nEstoque total: " + estoqueGeral + " unidades");
        System.out.println("Maior estoque acumulado: Produto " + produtoMaior);

        scanner.close();
	    }
	


	}



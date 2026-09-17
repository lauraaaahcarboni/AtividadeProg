package exercicios_Arrays;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		//  O exercício pede para criarmos um programa que utilize um array de double para armazenar 10 valores. Ao final, o programa deverá apresentar:
		//A. Todos os valores;
		//B. A soma dos valores;
		//C. A média;
		//D. O maior valor;
		//E. O menor valor;
		//F. A quantidade de valores acima da média.
		
		 Scanner scanner = new Scanner(System.in);
	        double[] valores = new double[10]; 
	        double soma = 0;
	       
	        for (int i = 0; i < valores.length; i++) {
	            System.out.print("Digite o valor " + (i + 1) + ": ");
	            valores[i] = scanner.nextDouble();
	            soma += valores[i]; 
	        }
	        
	        double media = soma / valores.length;
	        double maior = valores[0];
	        double menor = valores[0];
	        int acimaMedia = 0;
	        
	        for (int i = 1; i < valores.length; i++) {
	            if (valores[i] > maior) {
	                maior = valores[i];
	            }
	            if (valores[i] < menor) {
	                menor = valores[i];
	            }
	        }
	        for (int i = 0; i < valores.length; i++) {
	            if (valores[i] > media) {
	                acimaMedia++;
	            }
	        }
	        
	        System.out.print("\nValores digitados: ");
	        for (int i = 0; i < valores.length; i++) {
	            System.out.print(valores[i] + "  ");
	        }
	        System.out.println("\nA. Soma dos valores: " + soma);
	                System.out.println("B. Média: " + media);
	                System.out.println("C. Maior valor: " + maior);
	                System.out.println("D. Menor valor: " + menor);
	                System.out.println("E. Quantidade acima da média: " + acimaMedia);
	                
	                scanner.close();




	}

}

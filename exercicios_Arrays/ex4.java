package exercicios_Arrays;

public class ex4 {

	public static void main(String[] args) {
		// Criar um array contendo 15 números inteiros.
		//O programa deverá contar:
			//Quantos números são pares;
			//Quantos números são ímpares;
			//Quantos são maiores que 10;
			//Quantos são menores ou iguais a 10.
			//Ao final, apresentar os quatro resultados.
		
		int[] numeros = {15, 8, 32, 4, 21, 17, 9, 40, 12, 6, 10, 3, 11, 2, 19};
		int pares = 0;
		int impares = 0;
		int maiores10 = 0;
		int menoresIgual10 = 0;

		
		for (int i = 0; i < numeros.length; i++) {  
		  
		    if (numeros[i] % 2 == 0) {
		        pares++; 
		    } else {
		        impares++; 
		    }
		   
		    if (numeros[i] > 10) {
		        maiores10++; 
		    } else {
		        menoresIgual10++; 
		    }
		}
		
		System.out.println("Quantidade de pares: " + pares);
				System.out.println("Quantidade de ímpares: " + impares);
				System.out.println("Maiores que 10: " + maiores10);
				System.out.println("Menores ou iguais a 10: " + menoresIgual10);




	}

}

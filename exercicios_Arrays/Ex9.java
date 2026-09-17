package exercicios_Arrays;

public class Ex9 {

	public static void main(String[] args) {
		// O programa deverá preenchê-la automaticamente de maneira que:
		//● Os elementos da diagonal principal sejam 1;
		//● Todos os demais elementos sejam 0.
		
		int[][] matriz = new int[5][5];
		
		for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1; // Diagonal principal
                } else {
                    matriz[i][j] = 0; // Demais elementos
                }
            }
        }
		
		System.out.println("--- MATRIZ IDENTIDADE ---\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();


	}

	}
}

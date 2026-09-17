package exercicios_Arrays;

public class Ex5_foreach {

	public static void main(String[] args) {
		// Segunda versão
		
		  double[] valores = {5.5, 8.0, 10.0, 3.2, 7.5, 6.0, 4.5, 9.0, 8.5, 6.5};
	        double soma = 0;
	        // Usando for-each para somar
	        for (double v : valores) {
	            soma += v;
	        }
	        double media = soma / valores.length;
	        int acimaMedia = 0;
	        
	        for (double v : valores) {
	            if (v > media) {
	                acimaMedia++;
	            }
	        }

	        System.out.println("Soma: " + soma);
	        System.out.println("Média: " + media);
	        System.out.println("Acima da média: " + acimaMedia);
	        
	        /*
	         * Em qual das duas situações você precisou controlar o índice?
	         * R: Precisamos controlar o índice estritamente na versão com o 'for' tradicional. 
	         * No 'for-each', o Java oculta o índice (a variável 'i') de nós, permitindo 
	         * apenas ler os valores de forma direta, sem saber em qual posição exata estamos.
	         */




	}

}

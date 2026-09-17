package ativ2;

public class ex14 {
	 public static void main(String[] args) {
	        boolean chovendo = true;
	        boolean guardaChuva = false;
	        boolean carro = true;

	        System.out.println(chovendo && guardaChuva);
	        System.out.println(guardaChuva || carro);
	        System.out.println(!chovendo);
	        System.out.println(chovendo && (guardaChuva || carro));
	        System.out.println(!(chovendo && guardaChuva));
	    }
}

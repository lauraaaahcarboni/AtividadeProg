package ativ2;

public class ex13 {
	 public static void main(String[] args) {
	        boolean cnh = true;
	        boolean carro = false;
	        boolean dinheiro = true;

	        System.out.println(cnh && carro);// Falso porque o E (&&) exige que os dois lados sejam verdadeiros. Carro é falso.
	        System.out.println(carro || dinheiro); // Verdadeiro porque o OU (||) só precisa de um lado verdadeiro. Dinheiro é verdadeiro.
	        System.out.println(!cnh);// Falso porque o ! inverte o valor. CNH era verdadeiro e virou falso.
	        System.out.println(cnh && dinheiro);// Verdadeiro porque os dois lados do E (&&) são verdadeiros (CNH e Dinheiro).
	        System.out.println(!(carro || dinheiro)); // Falso porque a expressão dentro dos parênteses dá verdadeiro, mas o ! de fora inverte para falso.
	    }
}

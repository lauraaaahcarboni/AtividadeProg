package ativ1;

public class ex9 {
	
	public static void main(String[] args) {

		boolean possuiIng = true;
		boolean possuiDoc = false;
		boolean acompMaiorIdade = true;

		System.out.println(possuiIng && possuiDoc); // falso
		System.out.println(possuiIng || possuiDoc); // verdadeiro
		System.out.println(!possuiDoc); // verdadeiro
		System.out.println(possuiIng && (possuiDoc || acompMaiorIdade)); // verdadeiro
		System.out.println(!(possuiIng && possuiDoc)); // verdadeiro
	
	
	}

}

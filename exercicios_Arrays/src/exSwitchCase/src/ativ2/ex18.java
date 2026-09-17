package ativ2;

public class ex18 {
	public static void main(String[] args) {
		
		// O operador ternário funciona como um if-else em uma linha:
        // (condição) ? valor_se_verdadeiro : valor_se_falso;
        // O "?" faz a pergunta e o ":" separa as duas respostas possíveis.
        double media = 7.3;
        String resultado = (media >= 7) ? "Aprovado" : "Reprovado";

        System.out.println(resultado);
    }
}

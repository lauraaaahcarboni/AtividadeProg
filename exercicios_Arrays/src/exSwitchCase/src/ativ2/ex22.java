package ativ2;

public class ex22 {
	 public static void main(String[] args) {
	        String produto = "Notebook";
	        double valor = 1250.00;
	        int quantidade = 2;
	        int parcelas = 5;

	        double total = valor * quantidade;
	        double parcela = total / parcelas;

	        System.out.println("Nome do produto: " + produto);
	        System.out.println("Valor unitário: R$ " + valor);
	        System.out.println("Quantidade comprada: " + quantidade);
	        System.out.println("Valor total: R$ " + total);
	        System.out.println("Quantidade de parcelas: " + parcelas);
	        System.out.println("Valor da parcela: R$ " + parcela);
	    }
}

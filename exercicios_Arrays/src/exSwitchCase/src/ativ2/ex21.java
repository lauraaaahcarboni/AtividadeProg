package ativ2;

public class ex21 {
	public static void main(String[] args) {
        String nome = "João Gomes";
        double base = 2500.00;
        int horas = 8;

        double extras = horas * 35.00;
        double total = base + extras;

        System.out.println("Nome: " + nome);
        System.out.println("Salário base: R$ " + base);
        System.out.println("Valor das horas extras: R$ " + extras);
        System.out.println("Salário final: R$ " + total);
    }
}

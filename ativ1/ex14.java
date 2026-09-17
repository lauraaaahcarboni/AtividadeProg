package ativ1;

public class ex14 {
	public static void main(String[] args) {

		String nome = "Laura";
		double salario = 2500.00;
		int tEmpresa = 6;

		double bonus = (tEmpresa >= 5) ? 500.0 : 0.0;

		System.out.println("Nome: " + nome);
		System.out.println("Salário: R$ " + salario);
		System.out.println("Bônus: R$ " + bonus);
		System.out.println("Salário Final: R$ " + (salario + bonus));
		
	}
	
}

package fundamentosScanner;

import java.util.Scanner;

public class list2Atv1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome, curso;
		int idade;
		double altura, mf;
		boolean matricula;
		
		System.out.println("Qual seu nome?");
		nome = leia.nextLine();
		
		System.out.println("Qual seu curso?");
		curso = leia.nextLine();
		
		System.out.println("Qual sua idade?");
		idade = leia.nextInt();
		
		System.out.println("Qual sua altura");
		altura = leia.nextDouble();
		
		System.out.println("Qual sua média final?");
		mf = leia.nextDouble();
		
		System.out.println("Está matriculadO (true/false)??");
		matricula = leia.nextBoolean();
		
		System.out.println("\n--- Dados do aluno ---");
		System.out.println("Nome: " + nome);
		System.out.println("Curso: " + curso);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Média final: " + mf);
		System.out.println("Matriculado: " + matricula);
		
		leia.close();
	
	}

}

package fundamentosScanner;

import java.util.Scanner;

public class list1Ativ1 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o nome do aluno: ");
	        String nome = scanner.nextLine();

	        System.out.print("Digite a idade: ");
	        int idade = scanner.nextInt();

	        System.out.print("Digite a altura : ");
	        double altura = scanner.nextDouble();

	        System.out.print("Digite o peso : ");
	        double peso = scanner.nextDouble();

	        System.out.print("Digite o sexo (M/F): ");
	        char sexo = scanner.next().charAt(0);

	        System.out.print("A matrícula está ativa? (true/false): ");
	        boolean matriculaAtiva = scanner.nextBoolean();

	        String situacao = matriculaAtiva ? "ativa" : "inativa";

	       
	        System.out.println("\n--- Informações do Aluno ---");
	        System.out.println("Nome: " + nome + " | Idade: " + idade + " anos | Altura: " + altura + "m | Peso: " + peso + "kg | Sexo: " + sexo + " | Situação da matrícula: " + situacao);
	        
	        scanner.close();
	    
	}

}

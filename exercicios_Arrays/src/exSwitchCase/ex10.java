package exSwitchCase;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        
		 System.out.println("Cursos disponíveis:");
	        System.out.println("1 → Informática");
	        System.out.println("2 → Administração");
	        System.out.println("3 → Engenharia");
	        System.out.print("Escolha o curso: ");
	        int curso = scanner.nextInt();
	        
	        switch (curso) {
	            case 1:
	                System.out.println("\nDisciplinas de Informática:");
	                System.out.println("1 → Programação");
	                System.out.println("2 → Banco de Dados");
	                System.out.println("3 → Redes");
	                System.out.print("Escolha a disciplina: ");
	                int discInfo = scanner.nextInt();
	                
	                switch (discInfo) {
	                    case 1: System.out.println("Disciplina selecionada: Programação"); break;
	                    case 2: System.out.println("Disciplina selecionada: Banco de Dados"); break;
	                    case 3: System.out.println("Disciplina selecionada: Redes"); break;
	                    default: System.out.println("Erro: Disciplina inválida.");
	                }
	                break;
	                
	            case 2:
	                System.out.println("\nDisciplinas de Administração:");
	                System.out.println("1 → Marketing");
	                System.out.println("2 → Economia");
	                System.out.println("3 → Contabilidade");
	                System.out.print("Escolha a disciplina: ");
	                int discAdmin = scanner.nextInt();
	                
	                switch (discAdmin) {
	                    case 1: System.out.println("Disciplina selecionada: Marketing"); break;
	                    case 2: System.out.println("Disciplina selecionada: Economia"); break;
	                    case 3: System.out.println("Disciplina selecionada: Contabilidade"); break;
	                    default: System.out.println("Erro: Disciplina inválida.");
	                }
	                break;
	                
	            case 3:
	                System.out.println("\nDisciplinas de Engenharia:");
	                System.out.println("1 → Cálculo");
	                System.out.println("2 → Física");
	                System.out.println("3 → Desenho Técnico");
	                System.out.print("Escolha a disciplina: ");
	                int discEng = scanner.nextInt();
	                
	                switch (discEng) {
	                    case 1: System.out.println("Disciplina selecionada: Cálculo"); break;
	                    case 2: System.out.println("Disciplina selecionada: Física"); break;
	                    case 3: System.out.println("Disciplina selecionada: Desenho Técnico"); break;
	                    default: System.out.println("Erro: Disciplina inválida.");
	                }
	                break;
	                
	            default:
	                System.out.println("Erro: Curso inválido.");
	        }
	        
	        scanner.close();
	}

}

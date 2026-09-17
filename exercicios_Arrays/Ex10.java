package exercicios_Arrays;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// . Crie uma matriz double contendo as notas de 5 alunos em 4 avaliações:
		//O programa deverá:
		//A. Permitir o preenchimento das notas;
		//B. Exibir todas as notas;
		//C. Calcular a média de cada aluno;
		//D. Informar qual aluno obteve a maior média;
		//E. Informar qual aluno obteve a menor média;
		//F. Calcular a média geral da turma;
		//G. Informar quantos alunos ficaram com média igual ou superior a 7.0
		
		Scanner scanner = new Scanner(System.in);
        
        double[][] notas = new double[5][4];
        double[] medias = new double[5];// Vetor auxiliar para as notas
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("--- Digite as notas do Aluno " + (i + 1) + " ---");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("\n--- TODAS AS NOTAS (For-Each) ---");
        for (double[] aluno : notas) { // Para cada LINHA (vetor de notas do aluno)
            for (double nota : aluno) { // Para cada NOTA dentro dessa linha
                System.out.print(nota + "\t");
            }
            System.out.println();
        }
        
        double somaTurma = 0;
        for (int i = 0; i < notas.length; i++) {
            double somaAluno = 0;
            for (int j = 0; j < notas[i].length; j++) {
                somaAluno += notas[i][j];
            }
            medias[i] = somaAluno / notas[i].length; // Média individual
            somaTurma += medias[i]; // Acumula para a média geral da turma
        }
        System.out.println("\n--- MÉDIAS INDIVIDUAIS ---");
        for (int i = 0; i < medias.length; i++) {
            System.out.printf("Aluno %d - Média: %.1f\n", (i + 1), medias[i]);
        }

        double maiorMedia = medias[0];
        int alunoMaior = 1;
        double menorMedia = medias[0];
        int alunoMenor = 1;

        int aprovados = 0; // G. Contador de aprovados

        for (int i = 0; i < medias.length; i++) {
          
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                alunoMaior = i + 1;
            }
         
            if (medias[i] < menorMedia) {
                menorMedia = medias[i];
                alunoMenor = i + 1;
            }
            if (medias[i] >= 7.0) {
                aprovados++;
            }
        }

        double mediaTurma = somaTurma / medias.length;

        System.out.println("\nMaior média: Aluno " + alunoMaior + " - " + maiorMedia);
        System.out.println("Menor média: Aluno " + alunoMenor + " - " + menorMedia);
        System.out.printf("Média da turma: %.2f\n", mediaTurma);
        System.out.println("Alunos aprovados: " + aprovados);

        scanner.close();
		

	}

}

package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CALCULANDO MEDIAS DE ALUNOS ---");

        System.out.print("Informe a quantidade de alunos: ");
        int quantidadeAlunos = scanner.nextInt();

        System.out.print("Quantas notas por aluno: ");
        int quantidadeNotas = scanner.nextInt();

        double notasAlunos[][] = new double[quantidadeAlunos][quantidadeNotas];
        double totalNota[] = new double[quantidadeAlunos];
        double media[] = new double[quantidadeAlunos];
        double somaTotal = 0;

        for (int i = 0; i < notasAlunos.length; i ++){
            System.out.println("-- Aluno " + (i + 1));
            for (int j = 0; j < notasAlunos[i].length; j ++){
                System.out.println("Informwe a nota " + (j + 1));
                notasAlunos[i][j] = scanner.nextDouble();
                totalNota[i] += notasAlunos[i][j];
                media[i] = totalNota[i] / quantidadeNotas;
            }
            somaTotal += totalNota[i];
        }

        for (int i = 0; i < notasAlunos.length; i ++){
            System.out.println("-- Aluno " + (i + 1));
            for (int j = 0; j < notasAlunos[i].length; j ++){
                System.out.printf("Nota %d : %.2f \n", (j + 1), notasAlunos[i][j]);
            }
            System.out.println("Somas das motas: "+ totalNota[i]);
            System.out.println("Media das notas: "+ media[i]);
        }

        for (double[] i: notasAlunos){
            System.out.println(i);
        }

        System.out.println("-----------------------------------------");
        System.out.println("A media de notas da turma e: " + somaTotal / quantidadeAlunos);

    scanner.close();

    }
}
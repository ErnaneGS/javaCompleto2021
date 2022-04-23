package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double somaNotas = 0;

        System.out.println("--- MEDIAS DE NOTAS DE ALUNOS ---");
        System.out.print("Quantas notas voce deseja inserir: ");
        int quantidadeNotas = scanner.nextInt();

        double alunosNotas[] = new double[quantidadeNotas];

        for(int i = 0; i < alunosNotas.length; i++){
            System.out.printf("Informe a nota %d: ", i+1);
            double nota = scanner.nextDouble();
            alunosNotas[i] = nota;
        }

        for (double nota: alunosNotas){
            somaNotas += nota;
        }

        System.out.println();
        System.out.println("Notas do aluno: \n" + Arrays.toString(alunosNotas));
        System.out.println("A media das notas e: " + somaNotas/quantidadeNotas);

        scanner.close();
    }
}
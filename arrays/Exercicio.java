package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        //declaração do Array
        double notasAlunoA[] = new double[3];

        double totalAlunoA = 0;
        double mediaAlunoA = 0;

        notasAlunoA[0]= 7.9;
        notasAlunoA[1]= 8;
        notasAlunoA[2]= 6.7;

        //usamos a importação do Arrays para converter a array em string e assim poder imprimi-la de uma
        //forma mais legível
        Arrays.toString(notasAlunoA);
        System.out.println(Arrays.toString(notasAlunoA));

        //percorredno o array para soma de todas as notas do aluno
        for(int i = 0; i < notasAlunoA.length; i++){
            totalAlunoA += notasAlunoA[i];
        }

        System.out.println(totalAlunoA);
        System.out.println(mediaAlunoA = totalAlunoA / notasAlunoA.length);

        //outra forma de inicializar um array
        double notasAlunoB[] = {8.9, 2.5, 5.5, 6.9};

        double totalAlunoB = 0;
        double mediaAlunoB =0;

//        for(int i = 0; i < notasAlunoB.length; i++){
//            totalAlunoB += notasAlunoB[i];
//        }

        for(double nota: notasAlunoB){
            totalAlunoB += nota;
        }

        System.out.println(totalAlunoB);
        System.out.println(mediaAlunoB = totalAlunoB / notasAlunoB.length);
    }
}
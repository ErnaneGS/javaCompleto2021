package controle.exercicios;

import java.util.Scanner;

public class DiaSemana02 {
    public static void main(String[] args) {




        Scanner imput = new Scanner(System.in);
        System.out.print("\nInforme, por nome, o dia da semana: ");
        String day = imput.next();

        String[] week = { "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado" };
        boolean teste = false;

        for (int i = 0; i < week.length; i++) {
            if (week[i].equalsIgnoreCase(day)) {
                System.out.println("\n\n" + day + " é o " + (i + 1) + "º dia da semana.\n\n");
                teste = true;
            }
        }

        if(teste == false){
            System.out.println("O dia da semana é inválido!");
        }
        imput.close();
    }
}

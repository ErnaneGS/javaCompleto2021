package controle.exercicios;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-- MAIOR E MENOR ---");

        System.out.print("Informe o primerio numero: ");
        double numero01 = scanner.nextDouble();

        System.out.print("Informe o segundo numero: ");
        double numero02 = scanner.nextDouble();

        System.out.print("Informe o segundo numero: ");
        double numero03 = scanner.nextDouble();

        double maior = numero01;

        if(numero01 > numero02 && numero01 > numero03){
                maior = numero01;
            } else if (numero02 > numero01 && numero02 > numero03){
            maior = numero02;
        } else {
            maior = numero03;
        }

        System.out.println("o maior numero e o : " + maior);

        scanner.close();
    }
}

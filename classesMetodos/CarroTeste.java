package classesMetodos;

import java.util.Scanner;

public class CarroTeste {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe a cor do carro: ");
            String cor = scanner.next();
            System.out.println("Informe o ano do carro:");
            int ano = scanner.nextInt();

//            Carro carro = new Carro();

            Carro carro02 = new Carro();

            System.out.println(carro02);

        }
    }
}

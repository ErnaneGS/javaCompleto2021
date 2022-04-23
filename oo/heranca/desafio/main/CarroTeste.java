package oo.heranca.desafio.main;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Uno;

public class CarroTeste {

    public static void main(String[] args) {

        Carro carro01 = new Ferrari(200);
        Carro carro02 = new Uno();

        carro01.acelerar();
        carro02.acelerar();
        carro01.acelerar();
        carro02.acelerar();

        System.out.println(carro01.velocidadeAtual);
        System.out.println(carro02.velocidadeAtual);

    }
}

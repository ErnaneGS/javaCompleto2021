package oo.composicao;

public class CarroTeste {

    public static void main(String[] args) {

        Carro c1 = new Carro();

        System.out.println(c1.estaLigado());
        c1.ligar();
        System.out.println(c1.estaLigado());

        System.out.println(c1.motor.girosDoMotor());
        c1.acelerar();
        System.out.println(c1.motor.girosDoMotor());
    }
}
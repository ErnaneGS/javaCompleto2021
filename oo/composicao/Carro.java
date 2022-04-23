package oo.composicao;

public class Carro {

    //na classe carro temos como atributo a classe motor (1x1)
    Motor motor = new Motor();

    void acelerar() {
        if (motor.fatorInjecao > 2.6) {
            motor.fatorInjecao += 0.4;
        }
    }

    void freiar() {
        if (motor.fatorInjecao > 0.5) {
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }

}
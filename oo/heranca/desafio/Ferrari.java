package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportiva, Luxo{

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    @Override
    public void acelerar() {
       velocidadeAtual += 8;
    }

    @Override
    public void ligarTurbo() {

    }

    @Override
    public void desligarTurbo() {

    }

    @Override
    public void ligarAr() {

    }

    @Override
    public void desligarAr() {

    }
}

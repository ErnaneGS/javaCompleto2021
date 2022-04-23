package oo.heranca.desafio;

public class Carro {

   public int velocidadeAtual;
   public final int VELOCIDADE_MAXIMA;

   public Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
   }

    public void acelerar() {
        if (velocidadeAtual + VELOCIDADE_MAXIMA >= VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += 5;
        }
    }

    public void frear() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }
}
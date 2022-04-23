package oo.heranca;

public class Jogo {

    public static void main(String[] args) {

        Jogador j2 = new Jogador();
        Monstro j3 = new Monstro();
        Heroi j4 = new Heroi();

        j2.andar(Direcao.LESTE);
        j3.andar(Direcao.NORTE);
        j4.andar(Direcao.SUL);

    }
}

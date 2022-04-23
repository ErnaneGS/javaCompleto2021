package oo.heranca;

public class Monstro extends Jogador{
    //nesse caso o extends faz com que o monstro herde os métodos e atributos de jogador

    //iremos reusar o metodo atacar de jogador por duas vezes na classe monstro
    boolean atacar (Jogador oponente) {
        boolean ataque01 = super.atacar(oponente);
        boolean ataque02 = super.atacar(oponente);
        return ataque01 || ataque02;
    }
}

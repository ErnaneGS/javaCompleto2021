package oo.heranca;

public class Heroi extends Jogador{
    //nesse caso o extends faz com que o Heroi herde os métodos e atributos de jogador

    //sobrescrevendo o meotodo atacar da classe jhogador na classe heroi
    boolean atacar (Jogador oponente) {
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1 ) {
            oponente.vida -= 20;
            return true;
        } else if (deltaY == 0 && deltaX == 1) {
            oponente.vida -= 20;
            return true;
        } else {
            return false;
        }
    }
}

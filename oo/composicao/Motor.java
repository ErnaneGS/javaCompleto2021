package oo.composicao;

public class Motor {

    boolean ligado = false;
    double fatorInjecao = 1;

    int girosDoMotor(){
        if (ligado){
            return (int) Math.round(fatorInjecao * 3000);
        } else {
            return 0;
        }
    }
}
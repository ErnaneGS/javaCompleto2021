package classesMetodos;

public class Carro {
    String fabricante;
    String cor;
    int ano;

    public Carro(String cor){

    }

    public Carro(){

    }

    @Override
    public String toString() {
        return "Carro{" +
                "fabricante='" + fabricante + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                '}';
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

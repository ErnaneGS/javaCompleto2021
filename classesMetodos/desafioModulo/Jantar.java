package classesMetodos.desafioModulo;

public class Jantar {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Ana Maria", 70.0);

        Comida c1 = new Comida("Arroz", 0.100);
        Comida c2 = new Comida("Feijão", 0.100);
        Comida c3 = new Comida("Carne", 0.100);

        p1.escrever();
        p1.comer(c1);
        p1.escrever();
    }
}

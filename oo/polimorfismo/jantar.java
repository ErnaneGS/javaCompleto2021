package oo.polimorfismo;

public class jantar {

    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(99);

        Arroz ingrediente1 = new Arroz(0.25);
        Feijao ingrediente2 = new Feijao(0.25);
        Sorvete sobremesa = new Sorvete(0.500);

        System.out.println(convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);

        System.out.println(convidado.getPeso());

        convidado.comer(sobremesa);

        System.out.println(convidado.getPeso());

    }
}

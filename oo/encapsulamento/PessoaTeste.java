package oo.encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.setIdade(30); //alterando
        p1.setNome("Ernane");
        p1.setSobrenome("Sousa");

        System.out.println(p1);
        System.out.println(p1.getNomeCompelto());
    }
}

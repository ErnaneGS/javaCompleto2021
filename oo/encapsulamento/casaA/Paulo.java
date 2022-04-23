package oo.encapsulamento.casaA;

public class Paulo {

    void testeAcessos() {
        Ana ana = new Ana();
        //System.out.println(ana.privado);
        System.out.println(ana.protegido);
        System.out.println(ana.pacote);
        System.out.println(ana.protegido);
    }
}

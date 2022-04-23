package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void testeAcessos() {
        Ana ana = new Ana();
        //System.out.println(ana.privado);
        //System.out.println(ana.protegido);
        System.out.println(protegido);
        //System.out.println(ana.pacote);
        System.out.println(ana.publico);
    }
}

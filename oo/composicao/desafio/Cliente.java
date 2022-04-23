package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

   final String nome;
   final List<Compra> compra = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    Double valorGasto() {
        double total = 0;
        for (Compra compras : compra) {
            total += compras.totalCompra();
        }
        return  total;
    }
}

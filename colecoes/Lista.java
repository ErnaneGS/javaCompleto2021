package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Mario");
        lista.add(u1);

        lista.add(new Usuario("Ernane"));
        lista.add(new Usuario("Maria"));
        lista.add(new Usuario("Jose"));
        lista.add(new Usuario("Carlos"));

        //acessadno a lista pelo indice
        System.out.println(lista.get(3));

        for (Usuario u : lista){
            System.out.println(u);
        }

    }
}
package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        //instanciando um mpvp MAp chave valor
        Map<Integer, String> usuarios = new HashMap<>();

        //adicionar chave e valor no map
        usuarios.put(01, "Ernane");

        //substituindo valor de uma chabe
        usuarios.put(01, "Maria");

        //retorna as chaves do conjunto
        System.out.println(usuarios.keySet());

        //retorna as chaves do conjunto
        System.out.println(usuarios.values());

        //retorna as chaves + valores do conjunto
        System.out.println(usuarios.entrySet());

        //verifica se contem chave ou valor
        System.out.println(usuarios.containsKey(5));
        System.out.println(usuarios.containsValue("Ernane"));

        //obter valor atraves da chave
        System.out.println(usuarios.get(01));

        //remover
        System.out.println(usuarios.remove(1));
        System.out.println(usuarios.remove(1, "Joao"));

        //pewcorrendo map com for
        for (int chave : usuarios.keySet()){
            System.out.println(chave);
        }

        for (String valores : usuarios.values()){
            System.out.println(valores);
        }

        for (Map.Entry<Integer, String> registro:  usuarios.entrySet()){
            System.out.println(registro.getKey() + " " + registro.getValue());
        }
    }
}
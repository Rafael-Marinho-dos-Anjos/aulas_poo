package modulos.revisao_algoritmos.colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Colecoes {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        LinkedList<Integer> listaEncadeada = new LinkedList<>();
        listaEncadeada.add(3);
        listaEncadeada.add(4);
        listaEncadeada.add(5);

        for (int i = 0; i < lista.size(); i++) {
            System.out.printf(
                "Elemento %d: lista -> %d   lista encadeada -> %d%n",
                i,
                lista.get(i),
                listaEncadeada.get(i)
            );
        }


        HashMap<String, Integer> numeros = new HashMap<>();
        numeros.put("um", 1);
        numeros.put("dois", 2);
        numeros.put("três", 3);

        for (String s: numeros.keySet()) {
            System.out.printf("Número %s -> %d%n", s, numeros.get(s));
        }
    }
}

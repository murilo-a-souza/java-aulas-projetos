package br.com.fiap.main;

import java.util.*;

public class SorteioHashSet {
    static void main() {
        HashSet<Integer> numerosSorteados = new HashSet<Integer>();
        Random random = new Random();
        System.out.println("Resultado da Mega Sena");
        while (numerosSorteados.size() < 6) {
            int numero = random.nextInt(59) + 1;
            numerosSorteados.add(numero);
        }
        ArrayList<Integer> resultadoDoSorteio = new ArrayList<Integer>(numerosSorteados);
        Collections.sort(resultadoDoSorteio);
        System.out.println(resultadoDoSorteio);
    }
}

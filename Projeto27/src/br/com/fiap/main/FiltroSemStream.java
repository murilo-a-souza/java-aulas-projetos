package br.com.fiap.main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FiltroSemStream {
    static void main() {
        ArrayList<String> herois = new ArrayList<String>(Arrays.asList(
                "Homem Aranha",
                "Wolverine",
                "Hulk",
                "Capitão América",
                "Homem Elástico",
                "Pantera Negra",
                "Viúva Negra",
                "Mulher Maravilha",
                "Homem de Ferro",
                "Miss Marvel",
                "Mulher Invisível",
                "Cíclope"));
        ArrayList<String> heroisComH = new ArrayList<>();
        for (String heroi : herois) {
            if (heroi.startsWith("H")) {
                heroisComH.add(heroi);
            }
        }
        Collections.sort(heroisComH);
        System.out.println(heroisComH);

    }
}

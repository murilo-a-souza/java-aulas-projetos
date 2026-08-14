package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroComStream {
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
        List<String> heroisComH = herois.stream()
                .filter(heroi -> heroi.startsWith("H"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(heroisComH);

    }
}

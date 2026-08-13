package br.com.fiap.main;

import java.util.HashMap;
import java.util.Map;

public class NavegaHashMap {
    static void main() {
        HashMap<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Murilo", 18);
        pessoas.put("Calos", 41);
        pessoas.put("Pamela", 36);
//        System.out.println(pessoas);
        for (Map.Entry<String, Integer> valor : pessoas.entrySet()){
            System.out.printf("Nome: %s\tIdade: %d\n", valor.getKey(), valor.getValue());
        }
    }
}

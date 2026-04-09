package br.com.fiap.main;

import br.com.fiap.bean.ArCondicionado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArCondicionado ar1 = new ArCondicionado();
        String opcao;
        Scanner scanner;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Defina o modo (Ventilar, Resfriar ou Aquecer) e uma Temperatura (entre 15-26°).");
            System.out.println("Modo: ");
            ar1.setModo(scanner.next());
            System.out.println("Temp.: ");
            ar1.setTemperatura(scanner.nextInt());
            System.out.println("-----------------------\nO que você deseja fazer agora?\n-----------------------\na - Mudar de modo\nb - Aumentar temperatura\nc - Diminuir temperatura\n-----------------------");
            opcao = scanner.next();
            if (opcao.equalsIgnoreCase("a")) {
                System.out.println("Qual novo modo você deseja?");
                ar1.setModo(scanner.next());
            } else if (opcao.equalsIgnoreCase("b")) {
                ar1.aumentarTemperatura();
                System.out.println("Aumentando temperatura...");
            } else if (opcao.equalsIgnoreCase("c")) {
                ar1.diminuirTemperatura();
                System.out.println("Diminuindo temperatura...");
            } else {
                throw new Exception("Digite uma valor válido (Apenas \'a\', \'b\' ou \'c\')");
            }
            System.out.printf("-----------------------\nModo: %s\nTemp.: %d°\n-----------------------\n", ar1.getModo(), ar1.getTemperatura());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

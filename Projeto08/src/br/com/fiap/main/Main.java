package br.com.fiap.main;

import br.com.fiap.bean.Radio;
import br.com.fiap.bean.Televisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Radio radio = new Radio();
//        radio.setVolume(399);
//        radio.setEstacao(89.1f);
//        radio.aumentarVolume();
//        radio.aumentarVolume();
//        radio.aumentarVolume();
//        System.out.printf("Estação: %.1f\nVolume: %d\n", radio.getEstacao(), radio.getVolume());
//    Teste mogado:
//        Televisor televisor = new Televisor();
//        televisor.setVolume(23);
//        televisor.maisVolume();
//        televisor.maisVolume();
//        televisor.maisVolume();
//        televisor.setCanal(11);
//
        Televisor televisor = new Televisor();
        Scanner scanner;
        int escolha;
        try {
            scanner = new Scanner(System.in);

            System.out.println("Escolha um canal e digite o volume: ");
            televisor.setCanal(scanner.nextInt());
            televisor.setVolume(scanner.nextInt());
            System.out.printf("O que você deseja fazer?:\n1 - Definir outro canal\n2 - Definir novo volume\n3 - Aumentar o volume\n4 - Diminuir o volume\n");
            escolha = scanner.nextInt();
            if (escolha == 1) {
                System.out.println("Escolha um NOVO canal: ");
                televisor.setCanal(scanner.nextInt());
            } else if (escolha == 2) {
                System.out.println("Escolha um NOVO volume: ");
                televisor.setVolume(scanner.nextInt());
            } else if (escolha == 3) {
                televisor.maisVolume();
                System.out.println("Diminuindo volume...");
            } else if (escolha == 4) {
                televisor.menosVolume();
                System.out.println("Aumentando volume... ");
            } else {
                System.out.println("Digite uma opção válida!");
            }
            System.out.printf("Canal:\t%d\nVolume:\t%d", televisor.getCanal(), televisor.getVolume());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

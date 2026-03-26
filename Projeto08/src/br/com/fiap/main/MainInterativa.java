package br.com.fiap.main;

import br.com.fiap.bean.Televisor;

import java.util.Scanner;

public class MainInterativa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Televisor televisor = new Televisor();
        System.out.println("Digite o canal desejado: ");
        televisor.setCanal(scanner.nextInt());
        System.out.println("Digite o volume desejado: ");
        televisor.setVolume(scanner.nextInt());
        System.out.printf("O que você deseja fazer?:\n1 - Definir outro canal\n2 - Definir novo volume\n3 - Aumentar o volume\n4 - Diminuir o volume");
        int opcao = scanner.nextInt();
        if (opcao == 1) {
            System.out.println("Digite o canal desejado: ");
            televisor.setCanal(scanner.nextInt());
        } else if (opcao == 2) {
            System.out.println("Digite o volume desejado: ");
            televisor.setVolume(scanner.nextInt());
        } else if (opcao == 3) {
            televisor.maisVolume();
        } else if (opcao == 4) {
            televisor.menosVolume();
        } else if (opcao == 5){
            System.out.println("Digite uma opção válida!");
        }
        System.out.printf("Canal:\t%d\nVolume:\t%d", televisor.getCanal(), televisor.getVolume());
    }
}

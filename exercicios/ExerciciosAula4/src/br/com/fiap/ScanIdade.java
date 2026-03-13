package br.com.fiap;

import java.util.Scanner;

public class ScanIdade {
    public static void main(String[] args) {
        int nascimento, anoAtual, idade;
        Scanner scan;
        try {
            scan = new Scanner(System.in);
            System.out.println("Digite o ano em que você nasceu: (yyyy)");
            nascimento = scan.nextInt();
            System.out.println("Digite o ano atual: (yyyy)");
            anoAtual = scan.nextInt();
            idade = anoAtual - nascimento;
            System.out.println("Então, se você nasceu em " + nascimento + " e estamos em " + anoAtual + " você tem, aproximadamente " + idade + " anos.");
        } catch (Exception e) {
            System.out.println("Digite apenas números inteiros no formato (yyyy)");
        }
    }
}

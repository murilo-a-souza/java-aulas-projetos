package br.com.fiap.main;

import java.util.Scanner;

public class ComparaString {
    public static void main(String[] args) {
        String senha;
        Scanner scan = new Scanner(System.in);
        senha = scan.next();
        // verificando se as strings são identicas
        if (senha.equals("P4ssw0rD")) {
            System.out.println("Teste 1: Acesso concedido!");
        } else {
            System.out.println("Teste 1: Acesso negado!");
        }
        if (senha.equalsIgnoreCase("P4ssw0rD")) {
            System.out.println("Teste 2: Acesso autorizado!");
        } else {
            System.out.println("Teste 2: Acesso proibido!");
        }
    }
}

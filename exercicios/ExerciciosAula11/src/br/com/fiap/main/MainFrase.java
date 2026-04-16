package br.com.fiap.main;

import java.util.Scanner;

public class MainFrase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Digite um frase qualquer: ");
            String frase = scan.nextLine();
            System.out.printf("Essa frase tem: %d caracteres!\n", frase.length());
            System.out.printf("Essa frase em maiúsculo fica assim: \n%s\n",
                    frase.toUpperCase());
            System.out.println("------------------------------\nDigite uma palavra que queira mudar nessa frase dê ENTER, então, digite a palavra nova para qual vai mudar: ");
            frase = frase.replace(scan.nextLine(), scan.nextLine());
            System.out.printf("A frase ficou assim: \n%s\nCom %d caracteres agora!",
                    frase, frase.length());
            throw new Exception("Erro!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

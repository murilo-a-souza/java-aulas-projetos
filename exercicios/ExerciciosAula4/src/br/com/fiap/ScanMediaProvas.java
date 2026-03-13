package br.com.fiap;

import java.util.Scanner;

public class ScanMediaProvas {
    public static void main(String[] args) {
        int nota1, nota2, nota3, nota4, media;
        Scanner scan;
        try {
            scan = new Scanner(System.in);
            System.out.println("Digite a nota da 1ª prova: ");
            nota1 = scan.nextInt();
            System.out.println("Digite a nota da 2ª prova: ");
            nota2 = scan.nextInt();
            System.out.println("Digite a nota da 3ª prova: ");
            nota3 = scan.nextInt();
            System.out.println("Digite a nota da 4ª prova: ");
            nota4 = scan.nextInt();
            media = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.println("Nota da primeira prova:\t" + nota1 + "\nNota da segunda prova:\t" + nota2 + "\nNota da terceira prova:\t" + nota3 + "\nNota da quarta prova:\t" + nota4 + "\nMédia das notas: " + media);
        } catch (Exception e) {

        }
    }
}

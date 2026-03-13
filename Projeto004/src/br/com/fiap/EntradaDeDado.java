package br.com.fiap;

import java.util.Scanner;

public class EntradaDeDado {
    public static void main(String[] args) {
        int num1, num2, resultado;
        Scanner scan; // Declaração do objeto
        try {
            scan = new Scanner(System.in);
            System.out.println("Digite um número inteiro:");
            num1 = scan.nextInt();
            System.out.println("Digite outro número inteiro:");
            num2 = scan.nextInt();
            resultado = num1 + num2;
            System.out.println("Valor 1:\t" + num1 + "\nValor 2:\t" + num2 + "\nSomatário:\t" + resultado);

        } catch (Exception e) {
            System.out.println("Formato de número incorreto.");
        }
    }
}
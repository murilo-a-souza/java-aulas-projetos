package br.com.fiap.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite um número inteiro entre 1 e 10: ");
            int num1 = scanner.nextInt();
            if (num1 > 10 || num1 < 1){
                throw new Exception("Valor informado é fora do pemitido");
            }
            System.out.println("Digite outro inteiro: ");
            int num2 = scanner.nextInt();
            int num = num1 / num2;
            System.out.println("Resultado da multiplicação: " + num);
        } catch (ArithmeticException e) {
            System.out.println("Erro aritmético: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro de conversão: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro gerado: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Fim de programa");
        }

    }
}

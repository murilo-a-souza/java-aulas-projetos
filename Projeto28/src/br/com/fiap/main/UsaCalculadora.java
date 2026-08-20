package br.com.fiap.main;

import br.com.fiap.bean.Calculadora;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class UsaCalculadora {
    static void main() {
        Scanner scanner;
        Calculadora calc;
        try {
            String continuar;
            do {
                calc = new Calculadora();
                scanner = new Scanner(System.in);
                System.out.println("Digite um número real qualquer: ");
                float num1 = scanner.nextFloat();
                calc.setNumero1(num1);
                System.out.println("Digite outro número real qualquer: ");
                calc.setNumero2(scanner.nextFloat());
                int opcao = 0;
                do {
                    try {
                        System.out.println("------------ MENU ------------\n1. Realizar adição\n2. Realizar subtração\n3. Realizar multiplicação\n4. Realizar divisão\n0. Encerrar\n\nDigite uma opção: ");
                        opcao = scanner.nextInt();
                        switch (opcao) {
                            case 1:
                                System.out.println("Resultado da adição: " + calc.adicao());
                                break;
                            case 2:
                                System.out.println("Resultado da subtração: "+ calc.subtracao());
                                break;
                            case 3:
                                System.out.println("Resultado da multiplicação: "+ calc.multiplcacao());
                                break;
                            case 4:
                                System.out.println("Resultado da divisão: "+ calc.divisao());
                                break;
                            case 0:
                            default:
                                System.out.println("\nOpção inválida!\n");
                        }
                    } catch (ArithmeticException e) {
                        System.out.println("Erro Aritmético: " + e.getMessage());
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                } while (opcao != 0);
                System.out.println("Você quer continuar? (sim/não)");
                continuar = scanner.next().toLowerCase();
            } while(continuar.equals("sim"));
        } catch (InputMismatchException e) {
            System.out.println("Erro de conversão: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

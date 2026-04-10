package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;

import java.time.LocalDate;
import java.util.Scanner;

public class MainFunc2 {
    public static void main(String[] args) {
        float horasTrabalhadas;
        Funcionario func2;
        LocalDate data = LocalDate.now();
        Scanner scan;
        try {
            scan = new Scanner(System.in);
            System.out.println("Digite o NOME e depois o VALOR DA HORA DE TRABALHO:");
            func2 = new Funcionario(scan.nextLine(), scan.nextFloat());
            System.out.println("Digite o número de horas trabalhadas:");
            horasTrabalhadas = scan.nextFloat();
            System.out.printf("---------------------------------\nData:\t\t\t%d/%d/%d\nNome:\t\t\t%s\nValor da hora:\tR$%.2f/hora\nSalário:\t\tR$%.2f\n---------------------------------",
                    data.getDayOfMonth(), data.getMonthValue(), data.getYear(), func2.getNome(), func2.getValorHoraTrabalho(), func2.calcularSalario(horasTrabalhadas));
        } catch (Exception e) {
            System.out.println("Valor inválido.");
        }
    }
}

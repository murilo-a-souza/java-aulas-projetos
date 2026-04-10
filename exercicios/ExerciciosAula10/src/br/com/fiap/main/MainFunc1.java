package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;

import java.time.LocalDate;

public class MainFunc1 {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        Funcionario func1 = new Funcionario();
        func1.setNome("Murilo");
        func1.setValorHoraTrabalho(8);
        System.out.printf("---------------------------------\nData:\t\t\t%d/%d/%d\nNome:\t\t\t%s\nValor da hora:\tR$%.2f/hora\nSalário:\t\tR$%.2f\n---------------------------------",
                data.getDayOfMonth(), data.getMonthValue(), data.getYear(), func1.getNome(), func1.getValorHoraTrabalho(), func1.calcularSalario(50));
    }
}

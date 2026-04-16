package br.com.fiap.main;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class MainData {
    public static void main(String[] args) {
        Period periodo;
        LocalDate dataInicio;
        LocalDate dataFim;
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String mensagem;
        dataInicio = LocalDate.parse("2012-12-21");
        dataFim = LocalDate.parse("2026-04-14");
        periodo = Period.between(dataInicio, dataFim);
        mensagem = String.format("Data inicial: %s\nData final: %s\nEntre as datas fornecidas há %d ano(s), %d mês(es) e %d dia(s)",
                    dataInicio.format(dTF), dataFim.format(dTF), periodo.getYears(), periodo.getMonths(), periodo.getDays());
            JOptionPane.showMessageDialog(null, mensagem);
//  Tentativa com entrada do usuário
        try {
            dataInicio = LocalDate.parse(JOptionPane.showInputDialog("Digite uma data de início (ano-mes-dia):"));
            dataFim = LocalDate.parse(JOptionPane.showInputDialog("Digite uma data de fim (ano-mes-dia): "));
            periodo = Period.between(dataInicio, dataFim);
            mensagem = String.format("Data inicial: %s\nData final: %s\nEntre as datas fornecidas há %d ano(s), %d mês(es) e %d dia(s)",
                    dataInicio.format(dTF), dataFim.format(dTF), periodo.getYears(), periodo.getMonths(), periodo.getDays());
            JOptionPane.showMessageDialog(null, mensagem);
            throw new Exception("Erro!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

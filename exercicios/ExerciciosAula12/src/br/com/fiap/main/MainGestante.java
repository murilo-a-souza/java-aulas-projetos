package br.com.fiap.main;

import br.com.fiap.bean.Gestante;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainGestante {
    public static void main(String[] args) {
        Gestante gravida;
        String nome, auxiliar;
        LocalDate dataDaGestacao;
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            nome = JOptionPane.showInputDialog("Digite seu nome");
            auxiliar = JOptionPane.showInputDialog("Digite quando iniciou a gestação no formato dia/mês/ano");
            dataDaGestacao = LocalDate.parse(auxiliar, dTF);
            gravida = new Gestante(nome, dataDaGestacao);
            JOptionPane.showMessageDialog(null, String.format("Nome: %s\nInício da gestação: %s\nTempo de gestação: %s mês(es)",
                    gravida.getNome(), gravida.getDataDaGestacao(), gravida.tempoDeGestacao()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1;
        String auxiliar, nome;
        LocalDate dataNascimento;
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            nome = JOptionPane.showInputDialog("Digite seu nome").toUpperCase();
            auxiliar = JOptionPane.showInputDialog("Digite data de nascimento (dia/mês/ano)");
            // Arrumando a string no formato ano-mês-dia --> "21/12/2012"
//            String ano = auxiliar.substring(6, 10);
//            String mes = auxiliar.substring(3, 5);
//            String dia = auxiliar.substring(0, 2);
//            String dataEUA = ano + "-" + mes + "-" + dia; // --> "2012-12-21"
            dataNascimento = LocalDate.parse(auxiliar, dTF);
            pessoa1 = new Pessoa(nome, dataNascimento);
            JOptionPane.showMessageDialog(null, pessoa1.getDataNascimento());
            JOptionPane.showMessageDialog(null, String.format("Nome: %s\nData de Nascimento: (%s)\nIdade: %d",
                    pessoa1.getNome(), pessoa1.getDataNascimento(), pessoa1.calcularIdade()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

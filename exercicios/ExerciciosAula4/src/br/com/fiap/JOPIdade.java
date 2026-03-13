package br.com.fiap;

import javax.swing.*;

public class JOPIdade {
    public static void main(String[] args) {
        int nascimento, anoAtual, idade;
        String auxiliar;
        try {
            auxiliar = JOptionPane.showInputDialog("Digite o ano em que você nasceu: (yyyy)");
            nascimento = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite o ano atual: (yyyy)");
            anoAtual = Integer.parseInt(auxiliar);
            idade = anoAtual - nascimento;
            JOptionPane.showMessageDialog(null, "Então, se você nasceu em " + nascimento + " e estamos em " + anoAtual + " você tem, aproximadamente " + idade + " anos.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números inteiros no formato (yyyy)");
        }
    }
}

package br.com.fiap.main;

import br.com.fiap.bean.SuperHeroi;

import javax.swing.*;

public class MainSuperHeroi {
    static void main() {
        SuperHeroi heroi;
        String nome;
        String idSecreta;
        String[] poderes;
        String[] fraquezas;
        do {
            try {
                nome = JOptionPane.showInputDialog("Digite o nome do herói:");
                idSecreta = JOptionPane.showInputDialog("Digite a identidade secreta do herói:");
                poderes = new String[Integer.parseInt(JOptionPane.showInputDialog("Quantas poderes ele tem?"))];
                fraquezas = new String[Integer.parseInt(JOptionPane.showInputDialog("Quantas fraquezas ele tem?"))];
                for (int i = 0; i < poderes.length; i++) {
                    poderes[i] = JOptionPane.showInputDialog(String.format("Digite o %dº poder dele:", (i+1)));
                }
                for (int i = 0; i < fraquezas.length; i++) {
                    fraquezas[i] = JOptionPane.showInputDialog("Digite uma das fraquezas dele:");
                }
                heroi = new SuperHeroi(nome, idSecreta, poderes, fraquezas);
                heroi.listarHeroi();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa", "Adeus!", JOptionPane.WARNING_MESSAGE);
    }
}

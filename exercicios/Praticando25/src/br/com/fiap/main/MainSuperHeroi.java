package br.com.fiap.main;

import javax.swing.*;
import java.util.ArrayList;

public class MainSuperHeroi {
    static void main() {
        String nome, idSecreta, poder, fraqueza;
        ArrayList<String> poderes, fraquezas;
        SuperHeroi heroi;
        do {
            try {
                nome = JOptionPane.showInputDialog("Digite o nome do herói:");
                idSecreta = JOptionPane.showInputDialog("Digite a identidade secreta:");
                poderes = new ArrayList<String>();
                do {
                    poder = JOptionPane.showInputDialog("Digite um poder do herói ou \"fim\" para encerrar");
                    if (!poder.equalsIgnoreCase("fim")) {
                        poderes.add(poder);
                    }
                } while (!poder.equalsIgnoreCase("fim"));
                fraquezas = new ArrayList<String>();
                do {
                    fraqueza = JOptionPane.showInputDialog("Digite uma fraqueza do herói ou \"fim\" para encerrar");
                    if (!fraqueza.equalsIgnoreCase("fim")) {
                        fraquezas.add(fraqueza);
                    }
                } while (!fraqueza.equalsIgnoreCase("fim"));
                heroi = new SuperHeroi(nome, idSecreta, poderes, fraquezas);
                heroi.listarHeroi();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Você quer continuar?", "Atenção!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}

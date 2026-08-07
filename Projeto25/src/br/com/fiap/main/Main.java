package br.com.fiap.main;

import br.com.fiap.bean.Equipe;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    static void main() {
        Equipe grupo;
        String nome, integrante;
        ArrayList<String> integrantes;
        do {
            try {
                nome = JOptionPane.showInputDialog("Digite o nome da equipe");
                integrantes = new ArrayList();
                do {
                    integrante = JOptionPane.showInputDialog("Digite um integrante da equipe ou digite \"fim\" para encerrar");
                    if (!integrante.equalsIgnoreCase("fim")) {
                        integrantes.add(integrante);
                    }
                } while (!integrante.equalsIgnoreCase("fim"));
                grupo = new Equipe(nome, integrantes);
                grupo.listarEquipe();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Você quer continuar?", "Atenção!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa", "Adeus!", JOptionPane.WARNING_MESSAGE);
    }
}

package br.com.fiap.main;

import javax.swing.*;
import java.util.HashMap;
import java.util.Locale;

public class ExemploHashMap {
    static void main() {
        HashMap<String, String> mapa = new HashMap<>();
        do {
            try {
                String sigla, estado;
                do {
                    sigla = JOptionPane.showInputDialog("Digite a UF (Unidade Federal) de um estado ou digite \"FIM\" para encerrar").toUpperCase().strip();
                    if (!sigla.equals("FIM")) {
                        if (mapa.containsKey(sigla)) {
                            JOptionPane.showMessageDialog(null, "Estado JÁ cadastrado!");
                        } else {
                            estado = JOptionPane.showInputDialog("Digite o nome completo do estado informado: ");
                            mapa.put(sigla, estado);
                        }
                    }
                } while (!sigla.equals("FIM"));
                String escolha = JOptionPane.showInputDialog("Digite uma UF de um estado qualquer").toUpperCase();
                if (mapa.containsKey(escolha)) {
                    JOptionPane.showMessageDialog(null, "Nome do estado: " + mapa.get(escolha));
                } else {
                    JOptionPane.showMessageDialog(null, "Estado NÃO cadastrado");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa", "Adeus!", JOptionPane.WARNING_MESSAGE);
    }
}

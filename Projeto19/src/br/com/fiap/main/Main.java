package br.com.fiap.main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        do {
            try {
                int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha um tipo de mensagem\n1. Alerta\n2. Informação"));
                switch (opcao){
                    case 1:
                        JOptionPane.showMessageDialog(null,"Mensagem de alerta", "Alerta",JOptionPane.WARNING_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Mensagem de informação","Informação",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        throw new Exception("Opção inválida");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?","Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
    }
}

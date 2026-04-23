package br.com.fiap.main;

import br.com.fiap.bean.Adicao;

import javax.swing.*;

public class MainAdicao {
    public static void main(String[] args) {
        Adicao adicao1 = new Adicao();
        String continuar = "sim";
        String auxiliar, mensagem;
        int opcao, ni1, ni2;
        double nr1, nr2;

        while (continuar.equalsIgnoreCase("sim")) {
            try {
                auxiliar = JOptionPane.showInputDialog(null, "Qual soma você deseja realizar?:\n1 - Com números inteiros\n2 - Com números reais");
                opcao = Integer.parseInt(auxiliar);
                switch (opcao) {
                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Digite o primeiro número: ");
                        ni1 = Integer.parseInt(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Digite o segundo número: ");
                        ni2 = Integer.parseInt(auxiliar);
                        JOptionPane.showMessageDialog(null, String.format("Resultado da soma: %d", adicao1.somar(ni1, ni2)));
                        break;
                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Digite o primeiro número: ");
                        nr1 = Double.parseDouble(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Digite o segundo número: ");
                        nr2 = Double.parseDouble(auxiliar);
                        JOptionPane.showMessageDialog(null, String.format("Resultado da soma: %f", adicao1.somar(nr1, nr2)));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida");
                }
                continuar = JOptionPane.showInputDialog("Você deseja continuar? (sim/não)");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
}

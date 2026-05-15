package br.com.fiap.main;

import br.com.fiap.bean.Freelancer;
import br.com.fiap.bean.Vendedor;
import br.com.fiap.bean.VigiaNoturno;

import javax.swing.*;

public class MainPagamento {
    public static void main(String[] args) {
        do {
            try {
                int opcao = Integer.parseInt(JOptionPane.showInputDialog("Que tipo de salário você quer calcular?\n1. Vigia Noturno\n2. Vendedor\n3. Freelancer"));
                switch (opcao){
                    case 1:
                        VigiaNoturno vigia = new VigiaNoturno();
                        vigia.setAdicionalNoturno(Float.parseFloat(JOptionPane.showInputDialog("Qual é o adicional noturno?")));
                        vigia.setNome(JOptionPane.showInputDialog("Qual o nome do funcionário?"));
                        vigia.setValorHoraTrabalho(Float.parseFloat(JOptionPane.showInputDialog("Qual o valor da hora de trabalho do funcionário?")));
                        JOptionPane.showMessageDialog(null,
                                String.format("Nome: %s\nSalário: %.2f",
                                vigia.getNome(), vigia.calcularSalario()),
                                "Funcionário", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                        Vendedor vendedor= new Vendedor(
                                JOptionPane.showInputDialog("Qual o nome do funcionário?"),
                                Float.parseFloat(JOptionPane.showInputDialog("Qual o valor da hora de trabalho do funcionário?")),
                                Float.parseFloat(JOptionPane.showInputDialog("Qual é o valor da comissão (%) do vendedor?")));
                        JOptionPane.showMessageDialog(null,
                                String.format("Nome: %s\nSalário: %.2f",
                                vendedor.getNome(), vendedor.calcularSalario()),
                                "Funcionário", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3:
                        Freelancer freelancer = new Freelancer(JOptionPane.showInputDialog("Qual o nome do funcionário?"), Float.parseFloat(JOptionPane.showInputDialog("Qual o valor da hora de trabalho do funcionário?")), Long.parseLong(JOptionPane.showInputDialog("Qual é o CNPJ dele?")));
                        JOptionPane.showMessageDialog(null,
                                String.format("Nome: %s\nSalário: %.2f",
                                freelancer.getNome(), freelancer.calcularSalario()),
                                "Funcionário", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        throw new Exception("Valor inválido");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null,"Quer calcular mais?",
                "Continuar?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
    }
}

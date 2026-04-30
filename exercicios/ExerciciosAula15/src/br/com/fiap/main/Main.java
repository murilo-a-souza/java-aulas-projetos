package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;
import br.com.fiap.bean.Vendedor;
import br.com.fiap.bean.VigiaNoturno;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String auxiliar, nome, escolha = "sim";
        float valorHoraTrabalho, adicionais;
        int opcao;
        while (escolha.equalsIgnoreCase("sim")) {
            try {
                auxiliar = JOptionPane.showInputDialog("Qual tipo de salário deseja calcular?\n1. Funcionário (comum)\n2. Vigia noturno\n3. Vendedor");
                opcao = Integer.parseInt(auxiliar);
                switch (opcao) {
                    case 1:
                        nome = JOptionPane.showInputDialog("Digite o nome do funcionário: ");
                        auxiliar = JOptionPane.showInputDialog(String.format("Digite o valor da hora de trabalho do funcionário %s: ", nome));
                        valorHoraTrabalho = Integer.parseInt(auxiliar);
                        Funcionario funcionario = new Funcionario(nome, valorHoraTrabalho);
                        JOptionPane.showMessageDialog(null, String.format("O salário de %s é R$%.2f", nome, funcionario.calcularSalario()));
                        break;
                    case 2:
                        nome = JOptionPane.showInputDialog("Digite o nome do vigia: ");
                        auxiliar = JOptionPane.showInputDialog(String.format("Digite o valor da hora de trabalho do vigia %s: ", nome));
                        valorHoraTrabalho = Integer.parseInt(auxiliar);
                        auxiliar = JOptionPane.showInputDialog(String.format("Digite o valor adicional recebido pelo vigia %s", nome));
                        adicionais = Integer.parseInt(auxiliar);
                        VigiaNoturno vigiaNoturno = new VigiaNoturno(nome, valorHoraTrabalho, adicionais);
                        JOptionPane.showMessageDialog(null, String.format("O salário de %s é R$%.2f", nome, vigiaNoturno.calcularSalario()));
                        break;
                    case 3:
                        nome = JOptionPane.showInputDialog("Digite o nome do vendedor: ");
                        auxiliar = JOptionPane.showInputDialog(String.format("Digite o valor da hora de trabalho do vendedor %s: ", nome));
                        valorHoraTrabalho = Integer.parseInt(auxiliar);
                        auxiliar = JOptionPane.showInputDialog(String.format("Digite a comissão recebida pelo vendedor %s", nome));
                        adicionais = Integer.parseInt(auxiliar);
                        Vendedor vendedor = new Vendedor(nome, valorHoraTrabalho, adicionais);

                        JOptionPane.showMessageDialog(null, String.format("O salário de %s é R$%.2f", nome, vendedor.calcularSalario()));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Digite apenas opções válidas! (1-3)");
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar e realizar outro calculo de salário? sim/n");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim de programa!");
    }
}

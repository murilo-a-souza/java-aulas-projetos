package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;
import br.com.fiap.bean.Vendedor;
import br.com.fiap.bean.VigiaNoturno;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String auxiliar, nome, exibe = ".", escolha = "sim";
        float valorHoraTrabalho, adicionais, salario;
        while (escolha.equalsIgnoreCase("sim")) {
            try {
                auxiliar = JOptionPane.showInputDialog("Qual tipo de salário deseja calcular?\n1. Funcionário (comum)\n2. Vigia noturno\n3. Vendedor");
                int opcao = Integer.parseInt(auxiliar);
                nome = JOptionPane.showInputDialog("Digite o nome do funcionário: ");
                auxiliar = JOptionPane.showInputDialog(String.format("Digite o valor da hora de trabalho do funcionário %s: ", nome));
                valorHoraTrabalho = Integer.parseInt(auxiliar);
                switch (opcao) {
                    case 1:
                        Funcionario funcionario = new Funcionario(nome, valorHoraTrabalho);
                        salario = funcionario.calcularSalario();
                        JOptionPane.showMessageDialog(null, String.format("O salário de %s é R$%.2f", nome, funcionario.calcularSalario()));
                        break;
                    case 2:
                        auxiliar = JOptionPane.showInputDialog(String.format("Digite o valor adicional recebido pelo vigia %s", nome));
                        adicionais = Integer.parseInt(auxiliar);
                        VigiaNoturno vigiaNoturno = new VigiaNoturno(nome, valorHoraTrabalho, adicionais);
                        salario = vigiaNoturno.calcularSalario();
                        exibe = String.format("Nome: %s \nSalário: R$%.2f",vigiaNoturno.getNome(), salario);
                        break;
                    case 3:
                        auxiliar = JOptionPane.showInputDialog(String.format("Digite a comissão recebida pelo vendedor %s (%%)", nome));
                        adicionais = Integer.parseInt(auxiliar);
                        Vendedor vendedor = new Vendedor(nome, valorHoraTrabalho, adicionais);
                        salario = vendedor.calcularSalario();
                        exibe = String.format("Nome: %s \nSalário: R$%.2f",vendedor.getNome(), salario);
                        break;
                    default:
                        exibe = "Opção inválida";
                }
                JOptionPane.showMessageDialog(null, exibe);
                escolha = JOptionPane.showInputDialog("Deseja continuar e realizar outro calculo de salário? sim/n");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim de programa!");
    }
}

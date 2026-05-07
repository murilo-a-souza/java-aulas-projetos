package br.com.fiap.main;

import br.com.fiap.bean.ContaBancaria;
import br.com.fiap.bean.ContaEspecial;
import br.com.fiap.bean.ContaPoupanca;

import javax.swing.*;
import java.time.LocalDate;

public class MainConta {
    public static void main(String[] args) {
        String auxiliar, nome, exibe = null, escolha = "sim";
        int opcao, numConta;
        float saldo;
        while (escolha.equalsIgnoreCase("sim")) {
            try {
                auxiliar = JOptionPane.showInputDialog("Qual tipo de conta você possui?\n1 - Conta Bancária (normal)\n2 - Conta Poupança\n3 - Conta Especial");
                opcao = Integer.parseInt(auxiliar);
                nome = JOptionPane.showInputDialog("Qual o seu nome?");
                auxiliar = JOptionPane.showInputDialog("Qual o número da sua conta?");
                numConta = Integer.parseInt(auxiliar);
                auxiliar = JOptionPane.showInputDialog("Qual é o saldo da sua conta?");
                saldo = Float.parseFloat(auxiliar);
                switch (opcao){
                    case 1:
                        ContaBancaria normal = new ContaBancaria();
                        normal.setCliente(nome);
                        normal.setSaldo(saldo);
                        normal.setNumConta(numConta);
                        auxiliar = JOptionPane.showInputDialog("Quer sacar algum valor? (Digite 0 caso não)");
                        JOptionPane.showMessageDialog(null, String.format("Saldo atual: R$%.2f", normal.sacar(Float.parseFloat(auxiliar))));
                        auxiliar = JOptionPane.showInputDialog("Quer fazer algum depósito? (Digite 0 caso não)");
                        JOptionPane.showMessageDialog(null, String.format("Saldo atual: R$%.2f", normal.deposito(Float.parseFloat(auxiliar))));
                        exibe = String.format("Dados da conta:\nNome - %s\nNúmero da conta - %d\nSaldo final - R$%.2f",
                                normal.getCliente(), normal.getNumConta(), normal.getSaldo());
                        break;
                    case 2:
                        ContaPoupanca poupanca = new ContaPoupanca();
                        int diaAtual = LocalDate.now().getDayOfMonth();
                        poupanca.setCliente(nome);
                        poupanca.setSaldo(saldo);
                        poupanca.setNumConta(numConta);
                        auxiliar = JOptionPane.showInputDialog("Quer sacar algum valor? (Digite 0 caso não)");
                        JOptionPane.showMessageDialog(null, String.format("Saldo atual: R$%.2f", poupanca.sacar(Float.parseFloat(auxiliar))));
                        auxiliar = JOptionPane.showInputDialog("Quer fazer algum depósito? (Digite 0 caso não)");
                        JOptionPane.showMessageDialog(null, String.format("Saldo atual: R$%.2f", poupanca.deposito(Float.parseFloat(auxiliar))));
                        auxiliar = JOptionPane.showInputDialog("Qual o dia de rendimento da poupança?");
                        poupanca.setDiaDeRendimento(Integer.parseInt(auxiliar));
                        auxiliar = JOptionPane.showInputDialog("Qual é o rendimento da poupança? (em %)");
                        if (diaAtual >= poupanca.getDiaDeRendimento()) {
                            JOptionPane.showMessageDialog(null, String.format("Novo saldo com rendimento: R$%.2f", poupanca.novoSaldo(Float.parseFloat(auxiliar))));
                        } else {
                            JOptionPane.showMessageDialog(null, "Não chegou o dia do rendimento ainda!");
                        }
                        exibe = String.format("Dados da conta:\nNome - %s\nNúmero da conta - %d\nSaldo final - R$%.2f",
                                poupanca.getCliente(), poupanca.getNumConta(), poupanca.getSaldo());
                        break;
                    case 3:
                        ContaEspecial especial = new ContaEspecial();
                        especial.setCliente(nome);
                        especial.setSaldo(saldo);
                        especial.setNumConta(numConta);
                        auxiliar = JOptionPane.showInputDialog("Qual é o limite da sua conta?");
                        especial.setLimite(Float.parseFloat(auxiliar));
                        auxiliar = JOptionPane.showInputDialog("Quer sacar algum valor? (Digite 0 caso não)");
                        JOptionPane.showMessageDialog(null, String.format("Saldo atual: R$%.2f", especial.sacar(Float.parseFloat(auxiliar))));
                        auxiliar = JOptionPane.showInputDialog("Quer fazer algum depósito? (Digite 0 caso não)");
                        JOptionPane.showMessageDialog(null, String.format("Saldo atual: R$%.2f", especial.deposito(Float.parseFloat(auxiliar))));
                        exibe = String.format("Dados da conta:\nNome - %s\nNúmero da conta - %d\nSaldo final - R$%.2f",
                                especial.getCliente(), especial.getNumConta(), especial.getSaldo());
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "valor inválido! (1-3)");
                }
                JOptionPane.showMessageDialog(null, exibe);
                escolha = JOptionPane.showInputDialog("Você gostaria de continuar? sim/N");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Obrigado, fim do programa bancário!");
    }
}

package br.com.fiap.view;

import br.com.fiap.controller.ClienteController;

import javax.swing.*;

public class ClienteView {
    static void main() {
        String nome,placa;
        int id, opcao;
        String[] escolha = {"Inserir", "Alterar", "Excluir","Listar"};
        ClienteController clienteController = new ClienteController();

        do {
            try {
                opcao = JOptionPane.showOptionDialog(null,
                        "Escolha uma das opções abaixo para manipular um carro",
                        "Faça sua escolha",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        escolha,
                        escolha[0]);

                switch (opcao){
                    case 0:
                        nome = JOptionPane.showInputDialog("Digite o nome do do cliente");
                        placa = JOptionPane.showInputDialog("Digite a placa do cliente: ");
                        clienteController.inserirCliente(nome, placa);
                        break;
                    case 1:
                        id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do cliente que deseja alterar"));
                        nome = JOptionPane.showInputDialog("Digite o nome do do cliente");
                        placa = JOptionPane.showInputDialog("Digite a placa do cliente: ");
                        clienteController.alterarCliente(id,nome,placa);
                        break;
                    case 2:
                        id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do cliente que deseja alterar"));
                        clienteController.excluirCliente(id);
                        break;
                    case 3:

                        id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do cliente que deseja alterar"));
                        clienteController.listarUm(id);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida");
                        break;
                }




            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro" , JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?" , "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE ) == 0);

        JOptionPane.showMessageDialog(null, "Fim de programa", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}


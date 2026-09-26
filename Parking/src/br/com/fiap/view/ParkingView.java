package br.com.fiap.view;

import br.com.fiap.controller.CarroController;
import br.com.fiap.controller.ClienteController;

import javax.swing.*;

public class ParkingView {
    static void main() {
        String nome, placa, descricao, cor;
        int opcaoManipulacao, opcaoObjeto,id;
        String[] objeto = {"Carro", "Cliente"};
        String[] escolha ={"Inserir", "Alterar", "Excluir","Listar"};

        ClienteController clienteController = new ClienteController();
        CarroController carroCtrl = new CarroController();

        do {
            try {
                opcaoObjeto = JOptionPane.showOptionDialog(null, "Escolha o que dejesa manipular",
                        "Faça sua escolha",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        objeto,
                        objeto[0]);

                opcaoManipulacao = JOptionPane.showOptionDialog(null,
                        "Escolha uma das opções abaixo para manipular um o  objeto",
                        "Faça sua escolha",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        escolha,
                        escolha[0]);

                switch (opcaoObjeto){
                    case 0:
                        placa = JOptionPane.showInputDialog("Digite a placa do carro");
                        switch (opcaoManipulacao){
                            case 0:
                                cor = JOptionPane.showInputDialog("Digite a cor do carro");
                                descricao = JOptionPane.showInputDialog("Digite a descrição");
                                JOptionPane.showMessageDialog(null, carroCtrl.inserirCarro(placa,cor,descricao));
                                break;
                            case 1:
                                cor = JOptionPane.showInputDialog("Digite a cor do carro");
                                descricao = JOptionPane.showInputDialog("Digite a descrição");
                                JOptionPane.showMessageDialog(null, carroCtrl.alterarCarro(placa,cor,descricao));
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, carroCtrl.excluirCarro(placa));
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, carroCtrl.listarUm(placa));
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida");

                        }

                    case 1:
                        switch (opcaoManipulacao){
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
                        }


            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro" , JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?" , "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE ) == 0);

        JOptionPane.showMessageDialog(null, "Fim de programa", "Adeus", JOptionPane.WARNING_MESSAGE);
    }

    }


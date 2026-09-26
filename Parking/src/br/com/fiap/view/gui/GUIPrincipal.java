package br.com.fiap.view.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIPrincipal extends JFrame {
    private Container contentPane;
    private JMenuBar menuBar;
    private JMenu mnArquivo, mnCadastro;
    private JMenuItem miSair, miCarro, miCliente;

    public GUIPrincipal() {
        iniciarComponentes();
        definirEventos();
    }

    private void iniciarComponentes() {
        setTitle("Janela principal");
        setBounds(0,0,600,400);
        contentPane = getContentPane();

        menuBar = new JMenuBar();
        mnArquivo = new JMenu("Arquivo");
        mnCadastro = new JMenu("Cadastro");
        miCarro = new JMenuItem("Carro");
        miSair = new JMenuItem("Sair",new ImageIcon(getClass().getResource("images/exit_icon.png")));
        miCliente = new JMenuItem("Cliente");

        setJMenuBar(menuBar);
        menuBar.add(mnArquivo);
        menuBar.add(mnCadastro);
        mnArquivo.add(miSair);
        mnCadastro.add(miCarro);
        mnCadastro.add(miCliente);

    }
    private void definirEventos() {
        miSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        miCarro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUICarro carro = new GUICarro();
                contentPane.removeAll();
                contentPane.add(carro);
                contentPane.validate();
            }
        });
        miCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUICliente cliente = new GUICliente();
                contentPane.removeAll();
                contentPane.add(cliente);
                contentPane.validate();
            }
        });
    }

}

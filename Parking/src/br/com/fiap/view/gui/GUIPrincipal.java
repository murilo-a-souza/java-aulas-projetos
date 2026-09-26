package br.com.fiap.view.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIPrincipal extends JFrame {
    private Container contentPane;
    private JMenuBar menuBar;
    private JMenu mnArquivo, mnCadastro;
    private JMenuItem miSair;
    private JMenuItem miCarro;

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

        setJMenuBar(menuBar);
        menuBar.add(mnArquivo);
        menuBar.add(mnCadastro);
        mnArquivo.add(miSair);
        mnCadastro.add(miCarro);

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
                //declarar objeto de guicarro e instanciar
                //GUICarro carro = new GUICarro();
                contentPane.removeAll();
                // contentPane.add(carro);
                contentPane.validate();
            }
        });
    }

}

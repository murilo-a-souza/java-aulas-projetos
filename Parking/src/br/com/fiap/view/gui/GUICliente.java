package br.com.fiap.view.gui;

import javax.swing.*;
import java.awt.*;


public class GUICliente extends JFrame {

private JMenuBar menuBar;
private JMenu mnArquivo, mnCadastro;
private Container contentPane;
private JPanel painel;

    public GUICliente() {
        iniciarComponentes();
        definirEventos();
    }

    public void iniciarComponentes(){
        setTitle("Cliente");
        setBounds(0, 0, 900, 300);
        contentPane = getContentPane();
        menuBar = new JMenuBar();
        mnArquivo = new JMenu("Arquivo");
        mnCadastro = new JMenu("Cadastro");
        painel = new JPanel();

        menuBar.add(mnArquivo);
        menuBar.add(mnCadastro);
    }

    public void definirEventos(){

    }
}

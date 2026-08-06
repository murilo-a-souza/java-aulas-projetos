package br.com.fiap.main;

import javax.swing.*;

public class GUIPrincipal extends JFrame{
    public static void main(String[] args) {
        JMenuBar menuBar = new JMenuBar();
        JMenu arquivo = new JMenu();
        menuBar.add(arquivo);
        JMenuItem sair = new JMenuItem();
        arquivo.add(sair);
        JMenu funcionario = new JMenu();
        menuBar.add(funcionario);
        JMenuItem freelancer = new JMenuItem();
        funcionario.add(freelancer);
        JMenuItem vendedor = new JMenuItem();
        funcionario.add(vendedor);
        JMenuItem vigia = new JMenuItem();
        funcionario.add(vigia);

    }
}

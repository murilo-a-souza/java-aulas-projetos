package br.com.fiap.main;

import br.com.fiap.bean.Quadrado;
import br.com.fiap.bean.Retangulo;
import br.com.fiap.bean.Triangulo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String auxiliar, escolha = "sim";
        float lado, altura, area;
        int opcao;
        while (escolha.equalsIgnoreCase("sim")) {
            try {
                auxiliar = JOptionPane.showInputDialog("Qual área deseja calcular?\n1. Quadrado\n2. Retângulo\n3. Triângulo");
                opcao = Integer.parseInt(auxiliar);
                switch (opcao) {
                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Digite o lado do quadrado: ");
                        lado = Float.parseFloat(auxiliar);
                        Quadrado quadrado = new Quadrado(lado);
                        area = quadrado.calcularArea();
                        JOptionPane.showMessageDialog(null, String.format("Área do quadrado: %f", area));
                        break;
                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Digite o lado do retangulo: ");
                        lado = Float.parseFloat(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Digite a altura do retangulo: ");
                        altura = Float.parseFloat(auxiliar);
                        Retangulo retangulo = new Retangulo(lado, altura);
                        area = retangulo.calcularArea();
                        JOptionPane.showMessageDialog(null, String.format("Área do retangulo: %f", area));
                        break;
                    case 3:
                        auxiliar = JOptionPane.showInputDialog("Digite o lado do triangulo: ");
                        lado = Float.parseFloat(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Digite a altura do triangulo: ");
                        altura = Float.parseFloat(auxiliar);
                        Triangulo triangulo = new Triangulo(lado, altura);
                        area = triangulo.calcularArea();
                        JOptionPane.showMessageDialog(null, String.format("Área do triangulo: %f", area));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida, escolha de 1-3!");
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar? sim/não");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim de programa, volte sempre!");
    }
}

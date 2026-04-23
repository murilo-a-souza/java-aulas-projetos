package br.com.fiap.main;

import br.com.fiap.bean.Geometria;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Geometria geo1 = new Geometria();
        String auxiliar, escolha = "sim";
        int opcao;
        float lado, altura;
        double raio;
        while (escolha.equalsIgnoreCase("sim")) {
            try {
                auxiliar = JOptionPane.showInputDialog("Qual área deseja calcular? \n1- Quadrado\n2 - Retângulo\n3 - Círculo");
                opcao = Integer.parseInt(auxiliar);
                switch (opcao) {
                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Digite o lado do quadrado");
                        lado = Integer.parseInt(auxiliar);
                        geo1.calcularArea(lado);
                        break;
                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Digite a largura do retângulo");
                        lado = Integer.parseInt(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Digite a altura do retângulo");
                        altura = Integer.parseInt(auxiliar);
                        geo1.calcularArea(lado, altura);
                        break;
                    case 3:
                        auxiliar = JOptionPane.showInputDialog("Digite o raio do círculo");
                        raio = Double.parseDouble(auxiliar);
                        geo1.calcularArea(raio);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Escolha inválida");
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar? sim/não");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim de programa!");
    }
}

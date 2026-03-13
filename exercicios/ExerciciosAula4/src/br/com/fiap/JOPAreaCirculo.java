package br.com.fiap;

import javax.swing.*;

public class JOPAreaCirculo {
    public static void main(String[] args) {
        final float PI = 3.14f;
        float raio, area;
        String auxiliar;
        try {
            auxiliar = JOptionPane.showInputDialog("Digite o raio do círculo para calcular a área dele");
            raio = Float.parseFloat(auxiliar);
            area = (raio * raio) * PI;
            JOptionPane.showMessageDialog(null, "Um círculo com raio " + raio + " tem uma área de aproximadamente: " + area);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dígite apenas números");
        }
    }
}

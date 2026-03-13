package br.com.fiap;

import javax.swing.*;
import java.awt.*;

public class JOPMediaProvas {
    public static void main(String[] args) {
        float nota1, nota2, nota3, nota4, media;
        String auxiliar;
        try {
            auxiliar = JOptionPane.showInputDialog("Digite a nota da 1ª prova: ");
            nota1 = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite a nota da 2ª prova: ");
            nota2 = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite a nota da 3ª prova: ");
            nota3 = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite a nota da 4ª prova: ");
            nota4 = Float.parseFloat(auxiliar);
            media = ( nota1 + nota2 + nota3 + nota4 ) / 4;
            JOptionPane.showMessageDialog(null, "Nota da primeira prova: " + nota1 + "\nNota da segunda prova: " + nota2 + "\nNota da terceira prova: " + nota3 + "\nNota da quarta prova: " + nota4 + "\nMédia das notas: " + media);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!");
        }
    }
}

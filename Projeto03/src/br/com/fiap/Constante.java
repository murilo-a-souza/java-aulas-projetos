package br.com.fiap;

public class Constante {
    public static void main(String[] args) {
        final double PI = 3.1415;
        final float GRAVIDADE_TERRESTRE = 9.8f;
        double calculo = PI * GRAVIDADE_TERRESTRE;
        System.out.println("Valor de PI:\t\t\t" + PI + ";\nGravidade terrestre:\t" + GRAVIDADE_TERRESTRE + ";\nResultado:\t\t\t\t" + calculo + ".");
    }
}


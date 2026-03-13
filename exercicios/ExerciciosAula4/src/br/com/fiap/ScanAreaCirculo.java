package br.com.fiap;

import java.util.Scanner;

public class ScanAreaCirculo {
    public static void main(String[] args) {
        final float PI = 3.14f;
        float raio, area;
        Scanner scan;
        try {
            scan = new Scanner(System.in);
            System.out.println("Digite o raio do círculo para encontra a área:");
            raio = scan.nextFloat();
            area = (raio * raio) * PI;
            System.out.println("Um círculo com raio " + raio + " tem uma área de aproximadamente: " + area);
        } catch (Exception e) {
            System.out.println("Dígite apenas números");
        }
    }
}

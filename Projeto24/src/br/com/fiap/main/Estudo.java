package br.com.fiap.main;

public class Estudo {
    static void main() {
        String[] carros = {"Mitsubishi", "Ford", "Mazda", "BMW"};
        double[] numeros = new double[3];
        numeros[0] = 3.75;
        numeros[1] = 23.88;
        numeros[2] = 1.07;
        System.out.println("Tamanho do vetor: " + carros.length);
//        System.out.println(carros[0]);
//        System.out.println(carros[1]);
//        System.out.println(carros[2]);
//        System.out.println(carros[3]);
        for (String carro : carros) {
            System.out.println(carro + " ");
        }
        for (double i : numeros) {
            System.out.print(i + " ");
        }
    }
}

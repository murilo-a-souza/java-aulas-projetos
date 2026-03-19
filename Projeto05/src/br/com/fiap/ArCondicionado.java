package br.com.fiap;

public class ArCondicionado {
    public int temp;
    public String modo;
    public void aumentarTemp() {
        temp ++;
    }
    public void diminuirTemp() {
        temp --;
    }
    public void trocarModo(String novoModo) {
        modo = novoModo;
    }
// Teste mocado abaixo
    public static void main(String[] args) {
        ArCondicionado arCondicionado1 = new ArCondicionado();
        arCondicionado1.temp = 22;
        arCondicionado1.modo = "resfriar";
        arCondicionado1.diminuirTemp();
        arCondicionado1.diminuirTemp();
        arCondicionado1.diminuirTemp();
        arCondicionado1.diminuirTemp();
        arCondicionado1.diminuirTemp();
        arCondicionado1.diminuirTemp();
        arCondicionado1.diminuirTemp();
        arCondicionado1.diminuirTemp();
        arCondicionado1.diminuirTemp();
        arCondicionado1.diminuirTemp();
        arCondicionado1.trocarModo("ventilar");
        System.out.println("Temperatura:\t" + arCondicionado1.temp + "ºC\nModo atual:\t" + arCondicionado1.modo);
    }
}

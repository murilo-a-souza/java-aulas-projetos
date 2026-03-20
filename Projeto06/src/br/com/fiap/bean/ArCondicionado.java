package br.com.fiap.bean;

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
}


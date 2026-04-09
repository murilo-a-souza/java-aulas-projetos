package br.com.fiap.bean;

import java.nio.charset.StandardCharsets;

public class ArCondicionado {
    private int temperatura;
    private String modo;
    public int getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(int temperatura) {
        try {
            if (temperatura >= 15 && temperatura <= 26) {
                this.temperatura = temperatura;
            } else {
                throw new Exception("Temperatura fora da faixa permitida (15-26°)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public String getModo() {
        return modo;
    }
    public void setModo(String modo) {
        try {
            if (modo.equalsIgnoreCase("Ventilar") || modo.equalsIgnoreCase("Aquecer") || modo.equalsIgnoreCase("Resfriar")) {
                this.modo = modo;
            } else {
                throw new Exception("Modo não aceito (Apenas \"Ventilar\", \"Aquecer\" ou \"Resfriar\")");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void aumentarTemperatura() {
        if (temperatura < 26) {
            temperatura ++;
        }
    }
    public void diminuirTemperatura() {
        if (temperatura > 15) {
            temperatura --;
        }
    }
}

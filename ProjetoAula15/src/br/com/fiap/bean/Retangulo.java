package br.com.fiap.bean;

public class Retangulo extends Quadrado {
    private float altura;
    public Retangulo() {
    }
    public Retangulo(float lado, float altura) {
        this.altura = altura;
        super.setLado(lado);
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float calcularArea() {
        return super.getLado() * altura;
    }
}

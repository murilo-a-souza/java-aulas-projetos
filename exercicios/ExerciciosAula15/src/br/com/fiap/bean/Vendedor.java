package br.com.fiap.bean;

public class Vendedor extends Funcionario{
    private float Comissao;
    public Vendedor() {
    }
    public Vendedor(String nome, float valorHoraTrabalho, float comissao) {
        super(nome, valorHoraTrabalho);
        Comissao = comissao;
    }
    public float getComissao() {
        return Comissao;
    }
    public void setComissao(float comissao) {
        Comissao = comissao;
    }
    public float calcularSalario() {
        return super.calcularSalario() * (1 + getComissao() / 100);
    }
}

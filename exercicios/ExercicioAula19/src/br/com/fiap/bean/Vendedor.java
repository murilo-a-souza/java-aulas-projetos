package br.com.fiap.bean;

/**
 * Funcionário do tipo vendedor.
 * @author murilo-a-souza
 * @since Java 21
 */
public class Vendedor implements Funcionario{
    private String nome;
    private float valorHoraTrabalho;
    private float comissao;
    public Vendedor(){}
    public Vendedor(String nome, float valorHoraTrabalho, float comissao) {
        this.nome = nome;
        this.valorHoraTrabalho = valorHoraTrabalho;
        this.comissao = comissao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getValorHoraTrabalho() {
        return valorHoraTrabalho;
    }
    public void setValorHoraTrabalho(float valorHoraTrabalho) {
        this.valorHoraTrabalho = valorHoraTrabalho;
    }
    public float getComissao() {
        return comissao;
    }
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    /**
     * Calcula o salário do funcionário considerando as horas trabalhados e a % de comissão.
     * @return Retorna o valor final do salário calculado.
     */
    public float calcularSalario() {
        return ((valorHoraTrabalho*40)*4)*(1 + comissao/100);
    }
}

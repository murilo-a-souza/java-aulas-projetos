package br.com.fiap.bean;

/**
 * Funcionário do tipo vigia noturno
 * @author murilo-a-souza
 * @since Java 21
 */
public class VigiaNoturno implements Funcionario{
    private String nome;
    private float valorHoraTrabalho;
    private float adicionalNoturno;
    public VigiaNoturno() {}
    public VigiaNoturno(String nome, float valorHoraTrabalho, float adicionalTurno) {
        this.nome = nome;
        this.valorHoraTrabalho = valorHoraTrabalho;
        this.adicionalNoturno = adicionalTurno;
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
    public float getAdicionalNoturno() {
        return adicionalNoturno;
    }
    public void setAdicionalNoturno(float adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    /**
     * Calcula o salário do funcionário considerando as horas trabalhados e o adicional noturno.
     * @return Retorna o valor final do salário calculado.
     */
    public float calcularSalario() {
        return ((valorHoraTrabalho * 40) * 4 + adicionalNoturno);
    }
}

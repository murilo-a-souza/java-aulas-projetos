package br.com.fiap.bean;

public class FolhaDePagamento {

    public double salarioBruto;
    public int numeroDeDependentes;
    public double descontoINSS;
    public double valorPlanoDeSaude;

    public double calcularSalarioLiquido() {
        double salarioLiquido = ( salarioBruto - (  numeroDeDependentes * valorPlanoDeSaude ) - ( salarioBruto * ( descontoINSS / 100) ) );
        return salarioLiquido;
    }
}
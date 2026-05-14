package br.com.fiap.bean;

/**
 * Classe para objetos do tipo conta especial, que permitem sacar valores além do saldo
 * @author murilo-a-souza
 * @since Java 21
 */
public class ContaEspecial implements ContaBancaria{
    private int numConta;
    private float saldo;
    private float limite;
    public ContaEspecial (){}
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }
    /**
     * Realiza o saque de um valor informado, se for possível
     * A possibilidade é o valor total do saldo atual mais o limite da conta.
     * @param valor informa o valor a ser sacado
     * @return retorna o saldo após o saque
     */
    public float sacar(float valor) {
        try {
            if (valor <= saldo+limite) {
                saldo -= valor;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return saldo;
    }
    /**
     * Realiza o depósito do valor informado.
     * @param valor informa o valor a ser depositado
     * @return retorna o saldo após o depostio
     */
    public float depositar(float valor) {
        saldo += valor;
        return saldo;
    }
}

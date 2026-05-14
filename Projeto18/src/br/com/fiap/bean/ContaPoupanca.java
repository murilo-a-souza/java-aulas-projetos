package br.com.fiap.bean;

/**
 * Classe para objetos do tipo Conta Poupança
 * @author murilo-a-souza
 * @since Java 21
 */
public class ContaPoupanca implements ContaBancaria {
    private int numConta;
    private float saldo;
    public ContaPoupanca(){}
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
    /**
     * Permite sacar o valor informado.
     * Valor a ser sacado não pode ser maior que o saldo atual.
     * @param valor indica o valor a ser sacado
     * @return (float) valor do saldo atualizado
     */
    public float sacar(float valor) {
        try {
            if (valor <= saldo) {
                saldo -= valor;
            } else {
                throw new Exception("Saldo insuficiente!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return saldo;
    }
    /**
     * Permite depositar o valor informado.
     * @param valor informa o valor a ser depositado
     * @return (float) valor do saldo atualizado
     */
    public float depositar(float valor) {
        saldo += valor;
        return saldo;
    }
}

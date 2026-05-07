package br.com.fiap.bean;

import javax.swing.*;

public class ContaBancaria {
    private String cliente;
    private int numConta;
    private float saldo;
    public ContaBancaria() {
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
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
    public float sacar(float valor){
        try {
            if ((saldo - valor) >= 0) {
                setSaldo(saldo - valor);
            } else {
                throw new Exception(String.format("Valor a ser sacado não pode ser maior que o saldo que é: R$%.2f", saldo));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return saldo;
    }
    public float deposito(float valor){
        try {
            saldo = saldo + valor;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O valor deve ser número");
        }
        return saldo;
    }
}

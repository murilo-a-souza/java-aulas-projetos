package br.com.fiap.bean;

import javax.swing.*;

public class ContaEspecial extends ContaBancaria{
    private float limite;
    public ContaEspecial() {
    }
    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }
    public float sacar(float valor) {
        try {
            if (valor <= getSaldo()+limite) {
                setSaldo(getSaldo() - valor);
            } else {
                throw new Exception(String.format("Valor a ser sacado não pode ser maior que o saldo+limite, que é: R$%2.f", getSaldo()+limite));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return getSaldo();
    }
}

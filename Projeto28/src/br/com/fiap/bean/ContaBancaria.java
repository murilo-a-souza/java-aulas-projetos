package br.com.fiap.bean;

import br.com.fiap.exceptions.SaldoInsuficientException;

public class ContaBancaria {
    private double saldo;
    public ContaBancaria(){}
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void sacar(double quantia) throws SaldoInsuficientException {
        if (quantia > saldo){
            throw new SaldoInsuficientException("Saldo insuficiente para sacar!");
        }
        saldo -= quantia;
    }
}

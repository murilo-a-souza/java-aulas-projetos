package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private LocalDate dataNascimento;
    private float valorHoraTrabalho;
    public Funcionario() {
    }
    public Funcionario(String nome, LocalDate dataNascimento, float valorHoraTrabalho) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.valorHoraTrabalho = valorHoraTrabalho;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        try {
            if (dataNascimento.isAfter("1899-12-31")) {
                this.dataNascimento = dataNascimento;
            } else {
                throw new Exception("A data de nascimento precisa ser entre hoje e 01-01-1900");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public float getValorHoraTrabalho() {
        return valorHoraTrabalho;
    }
    public void setValorHoraTrabalho(float valorHoraTrabalho) {

        this.valorHoraTrabalho = valorHoraTrabalho;
    }
    public float calcularSalario() {
        return ((valorHoraTrabalho * 40) * 4);
    }
    public int calcularIdade() {

    }
}

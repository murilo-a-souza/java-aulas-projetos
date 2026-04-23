package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    public Pessoa() {
    }
    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        setDataNascimento(dataNascimento);
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
            LocalDate inicio = LocalDate.parse("1900-01-01").minusDays(1);
            LocalDate dataAtual = LocalDate.now().plusDays(1);
            if (dataNascimento.isAfter(inicio) && dataNascimento.isBefore(dataAtual)) {
                this.dataNascimento = dataNascimento;
            } else {
                throw new Exception("Fora da faixa permitida, use apenas datas entre 01/01/1900 e a Data atual!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0); // Encerra o programa após mensagem de erro.
        }
    }
    public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        Period idade = Period.between(dataNascimento, dataAtual);
        return idade.getYears();
    }
}

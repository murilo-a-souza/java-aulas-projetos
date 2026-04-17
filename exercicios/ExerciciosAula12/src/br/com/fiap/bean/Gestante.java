package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Gestante {
    private String nome;
    private LocalDate dataDaGestacao;
    public Gestante() {
    }
    public Gestante(String nome, LocalDate dataDaGestacao) {
        this.nome = nome;
        setDataDaGestacao(dataDaGestacao);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataDaGestacao() {
        return dataDaGestacao;
    }
    public void setDataDaGestacao(LocalDate dataDaGestacao) {
        try {
            LocalDate noveMeses = LocalDate.now().minusMonths(9).minusDays(1);
            if (dataDaGestacao.isAfter(noveMeses)) {
                this.dataDaGestacao = dataDaGestacao;
            } else {
                throw new Exception("Seu bebê já nasceu ou você passou a data errada!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
    }
    public int tempoDeGestacao() {
        LocalDate dataAtual = LocalDate.now();
        Period tempoDeGestacao;
        tempoDeGestacao = Period.between(dataDaGestacao, dataAtual);
        return tempoDeGestacao.getMonths();
    }
}

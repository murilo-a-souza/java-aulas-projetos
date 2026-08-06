package br.com.fiap.bean;

import javax.swing.*;

public class SuperHeroi {
    private String nome;
    private String idSecreta;
    private String[] poderes;
    private String[] fraquezas;
    public SuperHeroi() {}
    public SuperHeroi(String nome, String idSecreta, String[] poderes, String[] fraquezas) {
        this.nome = nome;
        this.idSecreta = idSecreta;
        this.poderes = poderes;
        this.fraquezas = fraquezas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getIdSecreta() {
        return idSecreta;
    }
    public void setIdSecreta(String idSecreta) {
        this.idSecreta = idSecreta;
    }
    public String[] getPoderes() {
        return poderes;
    }
    public void setPoderes(String[] poderes) {
        this.poderes = poderes;
    }
    public String[] getFraquezas() {
        return fraquezas;
    }
    public void setFraquezas(String[] fraquezas) {
        this.fraquezas = fraquezas;
    }
    public void listarHeroi(){
        String exibe = String.format("Nome do herói: %s\nIdentidade Secreta: %s\nPoderes:\n", nome, idSecreta);
        for (int i = 0; i < poderes.length; i++) {
            exibe += String.format("%d. %s\n", (i+1), poderes[i]);
        }
        exibe += String.format("Fraquezas:\n");
        for (String i : fraquezas){
            exibe += String.format("- %s\n", i);
        }
        JOptionPane.showMessageDialog(null, exibe, "TOP-SECRET", JOptionPane.INFORMATION_MESSAGE);
    }
}

package br.com.fiap.main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class SuperHeroi {
    private String nome;
    private String idSecreta;
    private ArrayList<String> poderes;
    private ArrayList<String> fraquezas;
    public SuperHeroi(){}
    public SuperHeroi(String nome, String idSecreta, ArrayList<String> poderes, ArrayList<String> fraquezas) {
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

    public ArrayList<String> getPoderes() {
        return poderes;
    }

    public void setPoderes(ArrayList<String> poderes) {
        this.poderes = poderes;
    }

    public ArrayList<String> getFraquezas() {
        return fraquezas;
    }

    public void setFraquezas(ArrayList<String> fraquezas) {
        this.fraquezas = fraquezas;
    }
    public void listarHeroi(){
        String exibe = String.format("Nome do herói: %s\nIdentidade Secreta: %s\nPoderes:\n", nome, idSecreta);
        Collections.sort(poderes);
        Collections.sort(fraquezas);
        for (int i = 0; i < poderes.size(); i++) {
            exibe += String.format("%d. %s\n", (i+1), poderes.get(i));
        }
        exibe += String.format("Fraquezas:\n");
        for (String i : fraquezas){
            exibe += String.format("- %s\n", i);
        }
        JOptionPane.showMessageDialog(null, exibe, "TOP-SECRET", JOptionPane.INFORMATION_MESSAGE);
    }
}

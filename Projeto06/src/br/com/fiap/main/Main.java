package br.com.fiap.main;

import br.com.fiap.bean.ArCondicionado;
import br.com.fiap.bean.FolhaDePagamento;
import br.com.fiap.bean.Televisor;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // mock test

//        Televisor tv = new Televisor();
//        tv.canal = 4.4f;
//        tv.volume = 56;
//        tv.trocarCanal(8.0f);
//        tv.diminuirVolume();
//        tv.aumentarVolume();
//        tv.aumentarVolume();
//        System.out.printf("Canal: %f\nVolume: %d\n", tv.canal, tv.volume);

        // teste ArCondicionado

//        ArCondicionado ar = new ArCondicionado();
//        ar.temp = 22;
//        ar.modo = "resfriar";
//        ar.diminuirTemp();
//        ar.diminuirTemp();
//        ar.diminuirTemp();
//        ar.diminuirTemp();
//        ar.diminuirTemp();
//        ar.diminuirTemp();
//        ar.diminuirTemp();
//        ar.diminuirTemp();
//        ar.diminuirTemp();
//        ar.diminuirTemp();
//        ar.trocarModo("ventilar");
//        String mensagem = String.format("Temperatura: %d°C\nModo: %s\n", ar.temp, ar.modo);
//        System.out.println(mensagem);
//        JOptionPane.showMessageDialog(null, mensagem);

        // Teste do Calculo de Salário
        FolhaDePagamento salario = new FolhaDePagamento();
        salario.salarioBruto = 2000;
        salario.numeroDeDependentes = 4;
        salario.descontoINSS = 20;
        salario.valorPlanoDeSaude = 100;
        System.out.println(salario.calcularSalarioLiquido());
    }
}

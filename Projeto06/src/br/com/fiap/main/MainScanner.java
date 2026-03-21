package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import javax.swing.*;
import java.util.Scanner;

//Criada depois da aula, prática indivídual
public class MainScanner {
    public static void main(String[] args) {
        FolhaDePagamento holerite;
        Scanner scanner;
        try {
            holerite = new FolhaDePagamento();
            scanner = new Scanner(System.in);
            System.out.println("Digite o salário bruto: (sem o R$)");
            holerite.salarioBruto = scanner.nextFloat();
            System.out.println("Digite o valor do plano de saúde: (sem o R$)");
            holerite.valorPlanoDeSaude = scanner.nextFloat();
            System.out.println("Digite o número de dependentes: (sem contar o funcionário)");
            holerite.numeroDeDependentes = scanner.nextInt();
            System.out.println("Qual é o desconto do INSS? (sem o %): ");
            holerite.descontoINSS = scanner.nextFloat();
            String mensagem = String.format("--------- HOLERITE FINAL ---------\nSalário bruto: \t\t\t\tR$%.2f\nValor do plano de saúde: \tR$%.2f\nNúmero de dependentes: \t\t%d\nPorcentagem de INSS: \t\t%.1f%%\nSalário Líquido: \t\t\tR$%.2f", holerite.salarioBruto, holerite.valorPlanoDeSaude, holerite.numeroDeDependentes, holerite.descontoINSS, holerite.calcularSalarioLiquido());
            System.out.println(mensagem);
            JOptionPane.showMessageDialog(null, mensagem);
        } catch (Exception e) {
            System.out.println("Você digitou alguma coisa errado, cuidado com caracteres especiais, espaços ou letras.");
        }
    }
}

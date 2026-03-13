package br.com.fiap;

public class Primitivos {
    public static void main(String[] args) {
        // declaração e inicialização de variáveis
        char sexo = 'F';
        byte idade = 25;
        short codigo = 15635;
        // É possível declarar várias váriaveis do mesmo tipo na mesma linha
        int alunos = 50, classes = 11;
        long habitantesDaTerra = 8280826418L;
        double dolar = 5.23;
        float media = 8.7f;
        boolean alternativa = true;
        String nome = "Astrogildo Planetário Celeste";
        System.out.println("Sexo: " + sexo + " Idade: " + idade + " Código: " + codigo);
        System.out.println("Alunos: " + alunos + " Classes: "  + classes + " Média: " + media);
        System.out.println("Habitantes da Terra: " + habitantesDaTerra + " Cotação: R$" + dolar);
        System.out.println("Alternativa: " + alternativa + " Nome: " + nome);
    }
}

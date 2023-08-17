package scool.sptech;

import java.util.Scanner;

public class miniExercicoNota {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Double soma = 0.0;


        System.out.println("Qual o nome do aluno?");
        String nomeAluno = leitor.nextLine();

        System.out.println("Quantas notas serão inseridas?");
        Integer qtdNotas = leitor.nextInt();

        Integer[] vtNotas = new Integer[qtdNotas];

        for (int i = 0; i < qtdNotas; i++) {
            System.out.println("Qual a nota %d ?".formatted(i+1));
            vtNotas[i] = leitor.nextInt();
            soma += vtNotas[i];
        }

        Double media =(soma/ qtdNotas);
        String situacao;

        if (media >= 6){
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }
        System.out.printf("nome do aluno: %s \n", nomeAluno);
        System.out.printf("Média: %.1f \n", media);
        System.out.printf("Situação: %s ", situacao);


    }
}

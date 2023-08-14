package scool.sptech;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o nome do aluno?");
        String nome = leitor.next();
        System.out.println("Qual a nota 1?");
        Double nota1 = leitor.nextDouble();
        System.out.println("Qual a nota 2?");
        Double nota2 = leitor.nextDouble();

        Double media = ((nota1 + nota2) / 2);

        System.out.println("Olá," + nome + " Sua média foi " + media);
    }
}

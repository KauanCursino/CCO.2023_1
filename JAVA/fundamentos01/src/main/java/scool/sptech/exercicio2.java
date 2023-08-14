package scool.sptech;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quanto tempo você passou se aquecendo?(em minutos)");
        Integer tempoAquecido = leitor.nextInt();
        System.out.println("Quantos tempo de cardio você fez?(em minutos)");
        Integer tempoCardio = leitor.nextInt();
        System.out.println("Quanto tempo de musculação você fez?(em minutos)");
        Integer tempoMusculacao = leitor.nextInt();

        Integer calorias = ((tempoAquecido * 12) + (tempoCardio * 20) + (tempoMusculacao * 25));

        System.out.println("Fala amigo(a)! Você fez um total de " + (tempoCardio + tempoAquecido + tempoMusculacao) + " minutos de exercicios hoje! E perdeu cerca de " + calorias + " calorias!");
    }
}

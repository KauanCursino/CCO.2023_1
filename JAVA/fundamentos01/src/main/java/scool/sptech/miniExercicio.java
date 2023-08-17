package scool.sptech;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class miniExercicio {
    public static void main(String[] args) {
        Integer [] vtNumeros = new Integer[10];
        Integer somaFinal = 0;

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < vtNumeros.length; i++) {
            System.out.println("Digite o %d número".formatted(i+1));
            vtNumeros[i] = leitor.nextInt();
        };



        for (Integer i = 0; i < vtNumeros.length; i++) {
            somaFinal += vtNumeros[i];
            System.out.println(somaFinal);
        }

    }
}

package scool.sptech;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha um número de 1 a 10");
        Integer numeroAlvo = leitor.nextInt();

        Integer sorteio = 0;
        Integer i;

        for (i = 0; numeroAlvo != sorteio; i++) {
            sorteio = ThreadLocalRandom.current().nextInt(0, 11);
            if (numeroAlvo == sorteio) {
                break;
            }
        }
        if (i <= 3) {
            System.out.println("Você é MUITO sortudo");
        } else if (i > 4 && i <= 10) {
            System.out.println("Você é sortudo, apenas");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar... na boa, não aposta mais não");
        }
        System.out.println("O sistema tentou chutar o seu número " + i + " vezes");
    }
}

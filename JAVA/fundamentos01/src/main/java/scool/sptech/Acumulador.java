package scool.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Acumulador {
    public static void main(String[] args) {
        Integer numeroAlvo = 0;
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
        Integer soma = 0;
        for (Integer i = 0; numeroSorteado != 0 ; i++) {
            numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
            soma = (soma + numeroSorteado);
        }
        System.out.println("A soma dos números sorteador foi de: " + soma);
    }
}

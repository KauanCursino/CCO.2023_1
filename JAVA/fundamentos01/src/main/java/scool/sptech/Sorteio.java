package scool.sptech;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer numeroEscolhido;
        do {
            System.out.println("Escolha um número de 1 a 100");
            numeroEscolhido = leitor.nextInt();
        } while(numeroEscolhido < 1 || numeroEscolhido > 100);

        Integer sorteio = ThreadLocalRandom.current().nextInt(0, 101);
        Integer primeiraVez = 0;
        Integer contadorPar = 0;
        Integer contadorImpar = 0;
        for (Integer i = 0; i < 200 ; i++) {
            sorteio = ThreadLocalRandom.current().nextInt(0, 101);
            if (sorteio.equals(numeroEscolhido) && primeiraVez == 0){
                    primeiraVez = i;
            }
            if ((sorteio%2) == 0){
                contadorPar++;
            }
            if ((sorteio%2) != 0){
                contadorImpar++;
            }
        }
        System.out.println("O seu número foi sortado pela primeira vez no sorteio de número: " + primeiraVez
            + ".Quantidade de números pares: " + contadorPar
            + ". Quantidade de números impares: " + contadorImpar);
    }
}

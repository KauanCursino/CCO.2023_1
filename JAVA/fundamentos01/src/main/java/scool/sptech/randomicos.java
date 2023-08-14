package scool.sptech;

import java.util.concurrent.ThreadLocalRandom;



public class randomicos {
    public static void main(String[] args) {

        Integer aleatorio = ThreadLocalRandom.current().nextInt(5,10);
        System.out.println(aleatorio);

         Double aleatorioReal =ThreadLocalRandom.current().nextDouble(0,10.1);
        System.out.printf("Olá %f", aleatorioReal);
    }
}

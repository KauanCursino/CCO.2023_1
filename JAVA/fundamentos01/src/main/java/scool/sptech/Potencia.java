package scool.sptech;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha um número base");
        Integer numeroBase = leitor.nextInt();
        System.out.println("Escolha a potência");
        Integer potencia = leitor.nextInt();

        System.out.println(Math.pow(numeroBase, potencia));
    }
}

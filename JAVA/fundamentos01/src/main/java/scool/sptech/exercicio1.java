package scool.sptech;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Integer bebes;
        Integer criancas;
        Integer xovensAdultos;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos filhos de até 3 anos você tem?");
        bebes = leitor.nextInt();

        System.out.println("Quantos filhos de 4 até 16 anos você tem?");
        criancas = leitor.nextInt();

        System.out.println("Quantos filhos de 17 e 18 anos você tem?");
        xovensAdultos = leitor.nextInt();

        Integer totalFilhos = (bebes + criancas + xovensAdultos);
        Double valorBebes = bebes * 25.12;
        Double valorCriancas = criancas * 15.88;
        Double valorXovens = xovensAdultos * 12.44;

        System.out.println("Com " + totalFilhos + " filhos você tem direito a: " + (valorBebes + valorCriancas + valorXovens) + " Reais de Bolsa Fliho");
    }
}

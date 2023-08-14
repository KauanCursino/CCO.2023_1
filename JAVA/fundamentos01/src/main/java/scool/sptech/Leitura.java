package scool.sptech;

import java.util.Scanner;

public class Leitura {

    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);

        System.out.println("Digitte o seu nome:");
        String nomeDigitado = leitor.nextLine();
        System.out.println("Olá " + nomeDigitado);

        System.out.println("Agora digite a sua idade:");
        Integer idadeDigitada = leitor.nextInt();
        System.out.println("Olá " + idadeDigitada);
        System.out.println("Seja Bem Vindo " + nomeDigitado + " " + "de " + idadeDigitada + " " + "Anos");
    }



}

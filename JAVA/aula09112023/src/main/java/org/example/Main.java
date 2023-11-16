package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Teste teste = new Teste();
        System.out.println(teste);

        Teste2 teste2 = new Teste2();
        Teste2 teste21 = new Teste2();

        teste2.setNome("Eu");
        teste21.setNome("Ela");

        System.out.println(teste2.getNome());
        System.out.println(teste21.getNome());
    }
}
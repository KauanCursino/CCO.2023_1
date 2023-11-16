package org.example;

public class Teste2 {

    /*private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }*/

    private static String nome;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Teste2.nome = nome;
    }
}

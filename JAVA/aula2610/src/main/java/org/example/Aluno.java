package org.example;

public abstract class Aluno {

    private String ra;
    private String nome;
    private Double monografia;

    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public abstract Double calcularMedia();

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }
}
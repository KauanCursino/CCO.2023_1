package org.example;

public class Quadrado extends Figura{

    private Double lado;

    public Quadrado(String cor, Integer espressura, Double lado) {
        super(cor, espressura);
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double calculaArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return super.toString() + "Quadrado{" +
                "lado=" + lado +
                '}';
    }
}

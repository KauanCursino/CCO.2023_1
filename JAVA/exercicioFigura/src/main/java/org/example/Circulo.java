package org.example;

public class Circulo extends Figura{

    private Double raio;

    public Circulo(String cor, Integer espressura, Double raio) {
        super(cor, espressura);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double calculaArea() {
        return 3.14 * Math.pow(raio,2);

    }

    @Override
    public String toString() {
        return super.toString() + "Circulo{" +
                "raio=" + raio +
                '}';
    }
}

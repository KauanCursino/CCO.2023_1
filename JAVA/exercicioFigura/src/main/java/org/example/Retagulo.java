package org.example;

public class Retagulo extends Figura{

    private Double base;
    private Double altura;

    public Retagulo(String cor, Integer espressura, Double base, Double altura) {
        super(cor, espressura);
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public Double calculaArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return super.toString() + "Retagulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}

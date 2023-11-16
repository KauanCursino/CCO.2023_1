package org.example;

public abstract class Figura {
    private String cor;
    private Integer espressura;

    public Figura(String cor, Integer espressura) {
        this.cor = cor;
        this.espressura = espressura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getEspressura() {
        return espressura;
    }

    public void setEspressura(Integer espressura) {
        this.espressura = espressura;
    }

    public abstract Double calculaArea();

    @Override
    public String toString() {
        return super.toString() + "Figura{" +
                "cor='" + cor + '\'' +
                ", espressura=" + espressura +
                '}';
    }

}

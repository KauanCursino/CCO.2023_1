package org.example;

public class Vendedor extends Funcionario{

    private Double vendas;
    private Double taxa;

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    @Override
    public Double calcSalario() {
        return vendas * taxa;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "vendas=" + vendas +
                ", taxa=" + taxa +
                '}';
    }
}

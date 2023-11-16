package org.example;

public class Teste {

    private Integer numeroInteiro;
    private Double numeroComPontoFlutuante;
    private Boolean ligado;
    private int numeroInteirinho;
    private double numerinhoComPontoFlutuante;
    private boolean ligadinho;

    /*
    * tipos primitivos já são inicializados com um valor padrão, pois não ssuportam o valor "NULL"
    * */

    Character teste = 'I';
    char testinho = 'I';

    @Override
    public String toString() {
        return "Teste{" +
                "numeroInteiro=" + numeroInteiro +
                ", numeroComPontoFlutuante=" + numeroComPontoFlutuante +
                ", ligado=" + ligado +
                ", numeroInteirinho=" + numeroInteirinho +
                ", numerinhoComPontoFlutuante=" + numerinhoComPontoFlutuante +
                ", ligadinho=" + ligadinho +
                ", teste=" + teste +
                ", testinho=" + testinho +
                '}';
    }
}

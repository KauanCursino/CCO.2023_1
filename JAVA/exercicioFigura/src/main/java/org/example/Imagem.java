package org.example;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    List<Figura> figuras = new ArrayList<>();
    List<Quadrado> quadrados = new ArrayList<>();

    public void adicionarFigura(Figura f){
        figuras.add(f);
    }

    public void exibeFiguras(){
        System.out.println(figuras.toString() + "\n");
    }
    public void exibeSomaArea(){
        Double areaTotal = 0.0;
        for (Figura figura : figuras){
            areaTotal += figura.calculaArea();
        }
    }

    public void exibeAreaMaior(){
        Double areaMaior = 0.0;
        Double areaAtual = 0.0;
        for (Figura figura : figuras){
            areaAtual = figura.calculaArea();
            if (areaAtual >= areaMaior){
                areaMaior = areaAtual;
                System.out.println(areaMaior);
            }
        }
    }
    public void exibeQuadrado(){
        for (Figura figura : figuras){
            if (figura instanceof Quadrado){
                System.out.println(figura);
            }
        }
    }

}

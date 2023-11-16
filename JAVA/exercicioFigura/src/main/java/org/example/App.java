package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class App {
    public static void main(String[] args) {



        Quadrado q1 = new Quadrado("verde",2, 10.00);
        Circulo c1 = new Circulo("azul", 4, 2.00);
        Retagulo r1 = new Retagulo("violeta", 4, 5.00, 3.00);
        Triangulo t1 = new Triangulo("marrom", 1, 3.00, 5.00);

        Imagem imagem = new Imagem();
        imagem.adicionarFigura(q1);
        imagem.adicionarFigura(c1);
        imagem.adicionarFigura(r1);
        imagem.adicionarFigura(t1);

        imagem.exibeFiguras();
        imagem.exibeAreaMaior();
        imagem.exibeQuadrado();
        imagem.exibeSomaArea();
    }
}
package school.sptech;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    //Método main que não retorna nada(void), q recebe uma string como parâmetro

    public static void main(String[] args) {


        Calculadora calculadora1 = new Calculadora();
        Calculadora.somar(10,10);


        //A palavra new gera um objeto da classe carro e aloca ele em memória
        Carro carrito1 = new Carro();
        Carro carrito2 = new Carro();

        carrito1.marca = "Fiat";
        carrito1.modelo = "Uno";
        carrito1.anoLancamento = 1995;

        carrito2.marca = "VolksWagen";
        carrito2.modelo = "Golzinho";
        carrito2.anoLancamento = 2000;

        System.out.println("Carrito 1: " + carrito1.modelo);
        System.out.println("Carrito 1: " + carrito2.modelo);

        System.out.println("--".repeat(30));

        System.out.println("Droga é o Braia VRUMMMMMM");
        carrito1.acelerar();
        carrito1.frear();

        System.out.println("Domink Tolete na pista");
        carrito2.acelerar();
        carrito2.frear();
    }
}
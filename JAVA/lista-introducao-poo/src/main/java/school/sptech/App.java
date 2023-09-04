package school.sptech;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Bolo bolo1 = new Bolo();
        Bolo bolo2 = new Bolo();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o sabor do seu bolo?");
        bolo1.sabor = leitor.next();
        bolo1.valor = 30.00;

        System.out.println("Qual o sabor do seu segundo bolo?");
        bolo2.sabor = leitor.next();
        bolo2.valor = 40.00;

        System.out.println("Qual a quantidade de bolo desejada?");
        bolo1.comprarBolo(40);
        bolo1.comprarBolo(50);
        bolo1.comprarBolo(50);

    }
}

package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);

        cofrinho cofre1 = new cofrinho();

        List propositos = new ArrayList<String>();


        System.out.println("Qual tua meta cabaço?");
        cofre1.proposito = leitorTexto.nextLine();


        while(cofre1.cofrinhoQuebrado == false) {
            System.out.println("Quer depositar quanto arrombado?");
            cofre1.saldo = leitorNumero.nextDouble();

            System.out.println("Quer qubrar o cofre? S/N");
            String respostaQebrarCofre = leitorTexto.nextLine();
            if (respostaQebrarCofre.equalsIgnoreCase( "S")){
                cofre1.cofrinhoQuebrado = true;
            }

        };

        System.out.println("Sua meta: " + cofre1.proposito);
        System.out.println("Seu saldo atual é: " + cofre1.saldo);
        System.out.println("Situação do cofre: " + cofre1.cofrinhoQuebrado);


    }
}
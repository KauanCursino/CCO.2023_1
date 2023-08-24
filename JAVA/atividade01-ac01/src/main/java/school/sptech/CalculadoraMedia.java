package school.sptech;

import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual a primeira nota?");
        Double nota1 = leitor.nextDouble();

        System.out.println("Qual a segunda nota?");
        Double nota2 = leitor.nextDouble();

        Double media = (nota1 * 0.4) + (nota2 * 0.6);

        System.out.printf("A sua média na SPTECH é %f", media);
    }
}

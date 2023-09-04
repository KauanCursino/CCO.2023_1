package school.sptech;

import java.util.Scanner;

public class TesteProgressaoAritmetica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual vai ser o primeiro termo?");
        Integer primeiroTermo = leitor.nextInt();

        System.out.println("Qual o termo que deseja buscar?");
        Integer nTermo = leitor.nextInt();

        System.out.println("Qual vais ser a razão desta progressão aritmética");
        Integer razao = leitor.nextInt();

        ProgressaoAritmetica calculo1 = new ProgressaoAritmetica(primeiroTermo, nTermo, razao);
        System.out.println(calculo1.calcularTermo());
    }
}

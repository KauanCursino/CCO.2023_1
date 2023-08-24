package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class desafioNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<Integer>();

        Boolean pararPergunta = false;

        while(pararPergunta == false){
            System.out.println("Digite um número\n");
            numeros.add(leitor.nextInt());
            System.out.println("Digite 0 para parar de adicionar númeors ou digite qualquer número para continuar");
            Integer sair = leitor.nextInt();
            if (sair == 0){
                pararPergunta = true;
                for (int i = 0; i < numeros.size(); i++) {
                    if (numeros[i] % 2 == 0){
                        List pares = new ArrayList();
                        System.out.println("Números pares %d", numeros[i]);
                    }
                }
            }
        }
    }
}

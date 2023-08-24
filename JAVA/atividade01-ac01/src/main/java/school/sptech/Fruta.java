package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fruta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List frutas = new ArrayList();

        Boolean iniciarPesquisa = false;

        while(iniciarPesquisa == false){
            System.out.println("Escreva o nome de uma fruta\n");
            frutas.add(leitor.next());
            System.out.println("Digite 0 para iniciar a pesquisa ou digite qualquer número para continuar adiciona a lista");
            Integer sair = leitor.nextInt();
            if (sair == 0){
                iniciarPesquisa = true;
            }
        }

        if (iniciarPesquisa == true){
            System.out.println("Pesquise o nome de uma fruta");
            String frutaPesquisada = leitor.next();
            Integer pesquisa = frutas.indexOf(frutaPesquisada);
            if (pesquisa != -1){
                System.out.printf("A fruta %s existe na lista!", frutaPesquisada);
            } else{
                System.out.printf("A fruta %s não existe na lista!", frutaPesquisada);
            }
        }


    }
}

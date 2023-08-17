package scool.sptech;

import java.util.ArrayList;
import java.util.List;

public class lacoDiferente {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList();
        nomes.add("Diego");
        nomes.add("Manoel");
        nomes.add("Caio");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println("-".repeat(15));

        // FOREACH ou FOR APRIMORADO/ENHANCED FOR
        for(String nomeDaVez: nomes){
            System.out.println(nomeDaVez);
        }

        nomes.forEach(nome -> System.out.println(nome));
    }
}

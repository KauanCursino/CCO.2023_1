package scool.sptech;

import java.util.ArrayList;
import java.util.List;

public class listas {
    public static void main(String[] args) {
        List listaDeferente = new ArrayList();

        /*
        listaDeferente.add("KauanLindão");
        listaDeferente.add(30);
        listaDeferente.add(true);
        listaDeferente.add(1.83);
        */
        List<Integer> numerosInteiros = new ArrayList();
        numerosInteiros.add(10);
        numerosInteiros.add(20);
        numerosInteiros.add(30);
        numerosInteiros.add(40);
        numerosInteiros.add(50);
        numerosInteiros.add(60);

        for (int i = 0; i < numerosInteiros.size(); i++) {
            System.out.println(numerosInteiros.get(i));
        }

        numerosInteiros.add(0, 20);
        System.out.println(numerosInteiros);
        numerosInteiros.remove(0);
        System.out.println(numerosInteiros);
    }
}

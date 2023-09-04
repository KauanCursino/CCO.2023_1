package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Bolo {
    String sabor;
    Double valor;
    Integer qtdVendida = 0;

    void comprarBolo(Integer qtdDesejada){
        if (qtdDesejada + qtdVendida > 100){
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo");
        } else{
            qtdVendida += qtdDesejada;
            System.out.printf(String.format("O saber %s, foi comprado %d vexs hoje, totalizando R$ %.2f",
                    sabor, qtdVendida, qtdVendida * valor));
        }
    }

}

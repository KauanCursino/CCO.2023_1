package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    List<Vendavel> cart = new ArrayList<>();

    public void adicionarVendavel(Vendavel v){

        for (Vendavel vendavel : cart){
            cart.add(vendavel);
        }
    }

    public Double calcularTotalVenda(){
        Double total = 0.0;
      for (Vendavel vendavel: cart){
          total += vendavel.getValorVenda();
      }
      return total;
    };

    public void exibeItensCarrinho(){
        System.out.println(cart);
    }
}

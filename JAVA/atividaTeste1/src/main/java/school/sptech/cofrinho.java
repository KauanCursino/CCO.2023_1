package school.sptech;

public class cofrinho {

    String proposito;
    Boolean cofrinhoQuebrado = false;
    Double saldo = 0.0;

    void depositar(Double valorDepositado){
        if (cofrinhoQuebrado == false){
            saldo += valorDepositado;
        }else{
            System.out.println("Seu cofre ta quebrado idiota, quer depositar dinheiro aonde porra?");
            return;
        }
    }

    void quebrarCofinhho(){
        Boolean cofrinhoQuebrado = true;
        System.out.println("Seu cofrinho quebrou");
    }

    void agitarCofrinho(){
        System.out.println();
        Math.random();
    }


}

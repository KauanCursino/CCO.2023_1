package school.sptech;

public class cofrinho {


    /*
    * modificadores de acesso:
    *
    * public
    * private
    * protected
    * default
    *
    * */

    private String proposito;
    private Boolean cofrinhoQuebrado = false;
    private Double saldo = 0.0;

    public cofrinho(){
        this.valor = 0.0;
        quebrado = false;
    }


    public Strign getProposito(){
        return proposito
    };

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

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

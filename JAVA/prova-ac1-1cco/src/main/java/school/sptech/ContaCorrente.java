package school.sptech;

public class ContaCorrente {
    private Double saldo;


    public ContaCorrente(Double saldo){
        this.saldo = saldo;
    }

    public void depositar(Double valor){
        if (valor <= 0){
            System.out.println("Erro: Operação de depósito inválida! Insira dados positivos e não nulos.");
            return;
        }else{
            this.saldo += valor;
            System.out.println("Você acaba de depositar: " +valor + " Reais, e seu novo saldo é de: " + this.saldo);
        }


    }

    public Double sacar(Double valor){

        if (valor <= 0 || valor > this.saldo ){
            System.out.println("Erro: operação de saque inválida! Insira dados positivos, não nulos e menores que o saldo atual!");
            return 0.00;
        }else {
            this.saldo = this.saldo - valor;
            System.out.println("Você acaba de sacar: " +valor + " Reais, e seu novo saldo é de: "  + this.saldo);
            return valor;
        }

    }

    public void transferir(Double valor, ContaCorrente contaDestino){
        if (valor <= 0 || valor > this.saldo) {
            System.out.println("Erro: operação de tranferência inválida!Insira dados positivos, não nulos e menores que o saldo atual!");
        }else{
            contaDestino.saldo += valor;
            this.saldo = this.saldo - valor;
            System.out.println("Você acaba de transferir: " + valor + " Reais, e seu novo saldo é de: " + this.saldo);
            System.out.println("Novo saldo da conta transferida: " + contaDestino.saldo + " Reais");
        }

    }

}

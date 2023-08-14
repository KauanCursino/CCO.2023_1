package scool.sptech;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o valor do produto?");
        Integer valorProduto = leitor.nextInt();
        System.out.println("Qual a quantidade que foi vendida?");
        Integer vezesVendido = leitor.nextInt();
        System.out.println("Qual o valor pago pelo cliente?");
        Integer pagamento = leitor.nextInt();

        Integer troco = pagamento - (valorProduto * vezesVendido);

        System.out.println("Seu troco será de R$ " + troco);
    }
}

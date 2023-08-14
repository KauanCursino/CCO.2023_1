package scool.sptech;

/*
        Classe em Pascal Case
        ex: MinhaClase
         */

public class Operadores {
    public static void main(String[] args) {
        /*
        ARITMÉTICOS:
        +
        -
        *
        /
        %
        Math.pow(numero1,numero2) para fazer potenciação
         */

        Integer numero1 = 10;
        Integer numero2 = 20;
        System.out.println("Soma: " + (numero1 + numero2));
        Double numeroReal1 = 1.5;
        Double numeroReal2 = 5.00;

        /*
        LÓGICOs:
        ==
        >
        <
        >=
        <+
        !=
        ||
        &&
         */

        if (numero1 == numero2){
            System.out.println("É igual");
        } else{
            System.out.println("Não é igual");
        }

        Boolean isIgual = numero1 == numero2;
        String mensagem = isIgual ? "é igual" : "Não ta igual saporra";
        System.out.println(mensagem);

        /*
        O switch é bom apenas em casos de comparação do valor da variavel, ou seja, comparar o o seu conteudo para determinados casos, pois não é possivel usar operadores lógicos no switch
         */

        Integer numeroOpcao = 2;
        switch (numeroOpcao){
            case 1:
                System.out.println("Usuario escolheu 1");
            break;


            case 2:
                System.out.println("Usuario escolheu 2");
            break;

            case 3:
                System.out.println("Usuario escolheu 3");
            break;

            default:
                System.out.println("Opção não encontrada");
        }
    }
}

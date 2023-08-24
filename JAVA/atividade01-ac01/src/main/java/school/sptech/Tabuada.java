package school.sptech;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual operação você deseja fazer? " +
                "1 - soma\n" +
                "2 - multiplicação\n" +
                "3 - divisão\n" +
                "4 - subtração\n" +
                "5 - potência\n" +
                "6 - resto\n" +
                "0 - Sair\n");
        Integer operacao = leitor.nextInt();

        System.out.println("Qual número você deseja fazer a tabuada?");
        Integer numero = leitor.nextInt();

        if (operacao == 1){
            for (int i = 0; i <= 10 ; i++) {
                Integer soma = numero + i;
                System.out.printf("%d + %d = %d\n", numero, i, soma);
                if (i == 10){
                    return;
                };
            };
        };
        if (operacao == 2){
            for (int i = 0; i <= 10 ; i++) {
                Integer multiplicacao = numero * i;
                System.out.printf("%d X %d = %d\n", numero, i, multiplicacao);
                if (i == 10){
                    return;
                };
            };
        };
        if (operacao == 3){
            for (int i = 1; i <= 10 ; i++) {
                Double divisao = (double) (numero / i);
                System.out.printf("%d ÷ %d = %f\n", numero, i, divisao);
                if (i == 10){
                    return;
                };
            };
        };
        if (operacao == 4){
            for (int i = 0; i <= 10 ; i++) {
                Integer subtracao = numero - i;
                System.out.printf("%d - %d = %d\n", numero, i, subtracao);
                if (i == 10){
                    return;
                };
            };
        };
        if (operacao == 5){
            for (int i = 0; i <= 10 ; i++) {
                Double potencia = Math.pow(numero,i);
                System.out.printf("%d ^ %d = %f\n", numero, i, potencia);
                if (i == 10){
                    return;
                };
            };
        };
        if (operacao == 6){
            for (int i = 1; i <= 10 ; i++) {
                Integer resto = numero % i;
                System.out.printf("%d % %d = %d\n", numero, i, resto);
                if (i == 10){
                    return;
                };
            };
        };
        if (operacao == 0){
            return;
        };
    }
}

package school.sptech;

import java.util.Objects;
import java.util.Scanner;

public class ExemploEnum {
    public static void main(String[] args) {

        System.out.println(DiasDaSemanaEnum.QUINTA);

        String nomeDoEnumerador = DiasDaSemanaEnum.QUARTA.name();
        System.out.println(nomeDoEnumerador);
        DiasDaSemanaEnum[] valoresPossiveis =  DiasDaSemanaEnum.values();

        System.out.println("Escolha uma das possibilidades abaixo:");
        for (DiasDaSemanaEnum enumerador : DiasDaSemanaEnum.values()) {
            System.out.println("-".repeat(10));
            System.out.println(enumerador) ;
        }

        Scanner in = new Scanner(System.in);
        int diasEscolhido = in.nextInt();
        DiasDaSemanaEnum enumEncontrado = DiasDaSemanaEnum.of(diasEscolhido);

        if (Objects.nonNull(enumEncontrado)){
            System.out.println("Você escolheu um enum: ");
            System.out.println(enumEncontrado);
        }else {
            System.out.println("Dia inválido");
        }
    }
}

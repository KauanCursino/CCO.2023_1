package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner leitorString = new Scanner(System.in);
        Scanner leitorInteger = new Scanner(System.in);

        Boolean loginSucesso = false;
        Boolean sair = false;

        List<String> loginEmail = new ArrayList<>();
        List<String> loginSenha = new ArrayList<>();
        List<String> agencias = new ArrayList<>();

        do {
            loginEmail.add(String.valueOf("testeUser@gmail.com"));
            loginSenha.add(String.valueOf("teste123"));

            System.out.println("Insira seu email");
            String emailDigitado = leitorString.nextLine();

            System.out.println("Insira sua senha");
            String senhaDigitada = leitorString.nextLine();

            if (loginEmail.contains(emailDigitado) && loginSenha.contains(senhaDigitada)){
                loginSucesso = true;

                System.out.println("Login realizado com sucesso!");
            }

        }while(loginSucesso.equals(false));

        if (loginSucesso.equals(true)){

            do {
                System.out.println("""
                    1.Deseja cadastrar novas agências?
                    2.Sair
                    """);
                Integer opcaoSelecionada = leitorInteger.nextInt();

                if (opcaoSelecionada == 1){
                    System.out.println("Qual será a agência cadastrada?");
                    agencias.add(leitorString.nextLine());
                    System.out.println(agencias);
                }
                if (opcaoSelecionada == 2){
                    sair = true;
                }

            }while (sair.equals(false));

        }

    }
}
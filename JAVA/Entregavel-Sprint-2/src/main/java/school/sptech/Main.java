package school.sptech;

import org.springframework.jdbc.core.JdbcTemplate;

import java.time.LocalDateTime;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner leitorInt = new Scanner(System.in);
        Scanner leitorString = new Scanner(System.in);

        Conexao conexao = new Conexao();
        JdbcTemplate con = conexao.getConexaoDoBanco();

        con.execute("""
                CREATE DATABASE Sprint;
                CREATE TABLE Login(
                idLogin INT PRIMARY KEY AUTO_INCREMENT,
                usuario VARCHAR(50),
                senha VARCHAR(50)
                );
                """);

        System.out.println("""
                1.Cadastrar
                2.Login
                3.Sair
        """);
        Integer escolha = leitorInt.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Usário:");
                String usuario = leitorString.nextLine();
                System.out.println("Senha:");
                String senha = leitorString.nextLine();
                con.update("INSERT INTO Login VALUES (?,?)", usuario, senha);
            case 2:
                con.execute("SELECT * FROM LOGIN WHERE usuario = ? AND senha = ?", usuario, senha);
            case 3:
                return;

        }
    }
}
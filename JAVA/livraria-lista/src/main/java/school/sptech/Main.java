package school.sptech;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner leitorString = new Scanner(System.in);
        Scanner leitorDouble = new Scanner(System.in);
        Scanner leitorInt = new Scanner(System.in);
        Conexao conexao = new Conexao();
        JdbcTemplate con = conexao.getConexaoDoBanco();

        List<Livro> listaDeLivros = new ArrayList<>();


        con.execute("""
                CREATE TABLE livrariaSpetch(
                id INT PRIMARY KEY AUTO_INCREMENT,
                nome VARCHAR (100),
                preco DECIMAL (5,2)
                )
                """
        );


        System.out.println("""
                1. Cadastrar Livro
                2. Exibir Livros
                3. Atualizar Livro
                4. Remover Livro
                5. Buscar por Livro
                6. Sair        
                """);
        Integer escolha = leitorInt.nextInt();

        if (escolha.equals(1)){
            System.out.println("Qual o nome do livro que deseja cadastrar?");
            String nomeDoLivro = leitorString.nextLine();
            con.execute("INSERT INTO livrariaSptech(nome) VALUES (?)", nomeDoLivro,new BeanPropertyRowMapper<>(Livro.class));
        }

    }
}
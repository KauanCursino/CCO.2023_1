package school.sptech;


import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.sistema.Sistema;
import com.github.javafaker.Faker;
import org.springframework.core.task.support.ConcurrentExecutorAdapter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Conexao conexao = new Conexao();
        JdbcTemplate con = conexao.getConexaoDoBanco();


        con.execute("DROP TABLE IF EXISTS filme");
        con.execute("""
                CREATE TABLE filme(
                id INT PRIMARY KEY AUTO_INCREMENT,
                nome VARCHAR(255),
                ano_lancamento INT
                )
                """);
        con.update("INSERT INTO filme(nome, ano_lancamento) VALUES ('Avatar 2', 2023 )");
        con.update("INSERT INTO filme(nome, ano_lancamento) VALUES ('Matrix', 1999 )");
        con.update("INSERT INTO filme(nome, ano_lancamento) VALUES ('Interestellar', 2014 )");


        String busca = "%at%";

        List<Filme> listaBusca = con.query("SELECT  * FROM filme WHERE nome LIKE ?" ,new BeanPropertyRowMapper<>(Filme.class), busca);

        System.out.println(listaBusca);

        Filme novoFilme = new Filme();
        novoFilme.setNome("Shrek");
        novoFilme.setAnoLancamento(2004);
        con.update("INSERT INTO filme (nome, ano_lancamento) VALUES (?, ?)", novoFilme.getNome(), novoFilme.getAnoLancamento());

        novoFilme.setId(4);
        novoFilme.setNome("Shrek 2");

        con.update("UPDATE filme SET nome = ?, ano_lancamento = ? WHERE id = ?", novoFilme.getNome(), novoFilme.getAnoLancamento(), novoFilme.getId());
        List<Filme> filmesDoBanco = con.query("SELECT * FROM filme", new BeanPropertyRowMapper<>(Filme.class));
        System.out.println(filmesDoBanco);
    }
}
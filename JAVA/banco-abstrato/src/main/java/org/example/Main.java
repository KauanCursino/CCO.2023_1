package org.example;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        JdbcTemplate con = new Conexao().getConexao();
        con.execute("drop table if exists produto");
        con.execute("""
                create table produto(
                id INT PRIMARY KEY AUTO_INCREMENT,
                nome VARCHAR(50) not null,
                precoBase DECIMAL(10,2) not null,
                tipo VARCHAR(50) not null,
                tensao INT,
                peso DECIMAL(10,2),
                fabricante VARCHAR(50),
                tamanho VARCHAR(5),
                cor VARCHAR(50),
                whiteLabel BOOLEAN
                );
                """);

        Eletronico e1 = new Eletronico(null, "Gameboy", 57000.00, 110, 0.1, "Nointendo");
        Vestuario v1 = new Vestuario(null, "Camiseta confotável", 35.0, "M", "Azul", true);

        con.update("INSERT INTO produto (nome, precoBase, tipo, tensao, peso, fabricante) VALUES (?,?,'ELETRONICO',?,?,?);",
                e1.getNome(), e1.getPrecoBase(), e1.getTensao(), e1.getPeso(), e1.getFabricante()
        );con.update("INSERT INTO produto (nome, precoBase, tipo, tamanho, cor, whiteLabel) VALUES (?,?,'VESTUARIO',?,?,?);",
                v1.getNome(), v1.getPrecoBase(),v1.getTamanho(), v1.getCor(), v1.getWhiteLabel()
        );

        List<Produto> todosOsProdutos = con.query("SELECT * FROM produto", new ProdutoRowMapper());

        System.out.println(todosOsProdutos);
    }
}
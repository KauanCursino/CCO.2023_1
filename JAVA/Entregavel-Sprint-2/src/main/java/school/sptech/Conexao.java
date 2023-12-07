package school.sptech;

import java.sql.Connection;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
        private static final String url = "jdbc:mysql://localhost:3306/ConWay";
        private static final String user = "user_conway";
        private static final String password = "urubu100";

        private static final String nameDrive = "com.mysql.cj.jdbc.Driver";
        private static Connection conexao;

        private JdbcTemplate conexaoDoBanco;

        public Conexao() {
            BasicDataSource dataSource = new BasicDataSource();
            dataSource.setDriverClassName(nameDrive);
            dataSource.setUrl(url);
            dataSource.setUsername(user);
            dataSource.setPassword(password);

            conexaoDoBanco = new JdbcTemplate(dataSource);
        }

        public JdbcTemplate getConexaoDoBanco() {
            return conexaoDoBanco;
        }

}

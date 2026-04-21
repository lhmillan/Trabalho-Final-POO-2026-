package br.com.projfinal.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private String url = "jdbc:postgresql://localhost:5432/turma";
    private String usuario = "postgres";
    private String senha = "";

    private Connection connection;

    public Connection getConnection() {
        System.out.println("Conectando no banco de dados....");
        try {
            connection = DriverManager.getConnection(url, usuario, senha);
            if (connection != null) {
                System.out.println("Conectado com sucesso!");
                return connection;
            } else {
                System.out.println("Não foi possível conectar!");
            }

        } catch (SQLException e) {
            System.out.println("Problemas no Driver ou senha incorreta do banco");
            e.printStackTrace();
        }
        return connection;
    }

    
}
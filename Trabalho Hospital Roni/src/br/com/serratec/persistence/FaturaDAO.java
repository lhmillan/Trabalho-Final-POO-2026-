package br.com.serratec.persistence;

import br.com.serratec.conexao.ConnectionFactory;
import br.com.serratec.model.Fatura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class FaturaDAO {

    private Connection connection;

    public FaturaDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public Fatura buscarPorId(int id) {

        String sql = "SELECT * FROM fatura WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Fatura(
                        rs.getInt("id"),
                        rs.getInt("paciente_id"),
                        rs.getDate("data_emissao").toLocalDate(),
                        rs.getDate("data_vencimento").toLocalDate(),
                        rs.getString("status"),
                        rs.getBigDecimal("valor_total")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}

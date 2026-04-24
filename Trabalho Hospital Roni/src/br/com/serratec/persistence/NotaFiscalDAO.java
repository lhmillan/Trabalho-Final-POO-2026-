package br.com.serratec.persistence;

import br.com.serratec.conexao.ConnectionFactory;
import br.com.serratec.model.NotaFiscal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NotaFiscalDAO {

    private Connection connection;

    public NotaFiscalDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void inserir(NotaFiscal nf) {

        String sql = "INSERT INTO nota_fiscal "
                + "(nome_emissor, data_emissao, descricao_atendimento, "
                + "valor_bruto, pis, cofins, iss, irpj, csll, fatura_id) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, nf.getNomeEmissor());
            stmt.setDate(2, java.sql.Date.valueOf(nf.getDataEmissao()));
            stmt.setString(3, nf.getDescricao());
            stmt.setBigDecimal(4, nf.getValorBruto());

            stmt.setBigDecimal(5, nf.calcularPIS());
            stmt.setBigDecimal(6, nf.calcularCOFINS());
            stmt.setBigDecimal(7, nf.calcularISS());
            stmt.setBigDecimal(8, nf.calcularIRPJ());
            stmt.setBigDecimal(9, nf.calcularCSLL());
            stmt.setInt(10, nf.getFaturaId());

            stmt.executeUpdate();
            System.out.println("Nota Fiscal gerada com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet buscarDados(int faturaId) {
        String sql = "SELECT p.nome, n.nome_emissor, n.descricao_atendimento, n.valor_bruto, "
                + "n.iss, n.pis, n.cofins, n.irpj, n.csll "
                + "FROM nota_fiscal n "
                + "JOIN fatura f ON n.fatura_id = f.id "
                + "JOIN paciente p ON f.paciente_id = p.id "
                + "WHERE n.fatura_id = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, faturaId);
            return stmt.executeQuery();
        } catch (SQLException e) {
            System.err.println("Erro ao buscar dados para CSV: " + e.getMessage());
            return null;
        }
    }
}

package br.com.serratec.service;

import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.Locale;

public class GerarCSV {

    public void gerarArquivoCSV(ResultSet rs) {
        try {
            
            if (rs != null && rs.next()) {
                PrintWriter writer = new PrintWriter("nota_fiscal"+rs.getString("nome").replace(" ", "")+".csv");
                writer.println("Prestador;Tomador;Descricao;Valor Bruto;ISS;PIS;COFINS;IRPJ;CSLL");

                writer.printf(Locale.US, "%s;%s;%s;%.2f;%.2f;%.2f;%.2f;%.2f;%.2f%n",
                        rs.getString("nome_emissor"),
                        rs.getString("nome"),
                        rs.getString("descricao_atendimento"),
                        rs.getBigDecimal("valor_bruto"),
                        rs.getBigDecimal("iss"),
                        rs.getBigDecimal("pis"),
                        rs.getBigDecimal("cofins"),
                        rs.getBigDecimal("irpj"),
                        rs.getBigDecimal("csll")
                );
                writer.close();
                System.out.println("Arquivo CSV gerado com sucesso!");
            }
        } catch (Exception e) {
            System.err.println("Erro ao gravar arquivo: " + e.getMessage());
            
        }
        
    }
}

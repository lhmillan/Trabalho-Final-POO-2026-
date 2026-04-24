package br.com.serratec.service;

import br.com.serratec.model.Fatura;
import br.com.serratec.model.NotaFiscal;
import br.com.serratec.persistence.FaturaDAO;
import br.com.serratec.persistence.NotaFiscalDAO;
import java.sql.ResultSet;
import java.time.LocalDate;

public class InserirNotaFiscal {

    private FaturaDAO faturaDAO = new FaturaDAO();
    private NotaFiscalDAO nfDAO = new NotaFiscalDAO();
    private GerarCSV gerarCSV = new GerarCSV();

    public void gerarNota(int faturaId) {
        Fatura fatura = faturaDAO.buscarPorId(faturaId);

        if (fatura == null) {
            System.out.println("ERRO: Fatura com ID " + faturaId + " não encontrada ou status ainda NÃO consta como pago.");
            return;
        }

        NotaFiscal nf = new NotaFiscal(
                null,
                "Sistema Hospitalar Serratec",
                LocalDate.now(),
                "Prestação de serviços médicos hospitalares",
                fatura.getValorTotal(),
                fatura.getId()
        );
        nfDAO.inserir(nf);

        ResultSet rs = nfDAO.buscarDados(faturaId);
        gerarCSV.gerarArquivoCSV(rs);
    }
}

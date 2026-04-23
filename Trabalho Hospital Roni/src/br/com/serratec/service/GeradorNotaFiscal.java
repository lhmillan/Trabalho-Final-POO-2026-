package br.com.serratec.service;

import br.com.serratec.model.Fatura;
import br.com.serratec.model.NotaFiscal;
import br.com.serratec.persistence.FaturaDAO;
import br.com.serratec.persistence.NotaFiscalDAO;
import java.time.LocalDate;

public class GeradorNotaFiscal {

    private FaturaDAO faturaDAO = new FaturaDAO();
    private NotaFiscalDAO nfDAO = new NotaFiscalDAO();

    public void gerarNota(int faturaId) {
        Fatura fatura = faturaDAO.buscarPorId(faturaId);

        if (fatura != null) {

            NotaFiscal nf = new NotaFiscal(
                    null,
                    "Serratec Health System",
                    LocalDate.now(),
                    "Prestação de serviços médicos hospitalares",
                    fatura.getValorTotal(),
                    fatura.getId()
            );

            nfDAO.inserir(nf);
        } else {
            System.out.println("ERRO: Fatura com ID " + faturaId + " não encontrada.");
        }
    }
}

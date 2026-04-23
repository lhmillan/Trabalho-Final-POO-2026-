package br.com.serratec.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Fatura {

    private Integer id;
    private Integer pacienteId;
    private LocalDate dataEmissao;
    private LocalDate dataVencimento;
    private String status;
    private BigDecimal valorTotal;

    public Fatura(Integer id, Integer pacienteId, LocalDate dataEmissao,
            LocalDate dataVencimento, String status, BigDecimal valorTotal) {
        this.id = id;
        this.pacienteId = pacienteId;
        this.dataEmissao = dataEmissao;
        this.dataVencimento = dataVencimento;
        this.status = status;
        this.valorTotal = valorTotal;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPacienteId() {
        return pacienteId;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public String getStatus() {
        return status;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }
}

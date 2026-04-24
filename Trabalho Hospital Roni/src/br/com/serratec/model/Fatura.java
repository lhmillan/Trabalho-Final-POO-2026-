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
    private Integer planoSaudeId;
    private String formaPagamento;
    private Atendimento atendimento;

    public Fatura(Integer id, Integer pacienteId, LocalDate dataEmissao, LocalDate dataVencimento,
            String status, BigDecimal valorTotal, Integer planoSaudeId, String formaPagamento) {
        this.id = id;
        this.pacienteId = pacienteId;
        this.dataEmissao = dataEmissao;
        this.dataVencimento = dataVencimento;
        this.status = status;
        this.valorTotal = valorTotal;
        this.planoSaudeId = planoSaudeId;
        this.formaPagamento = formaPagamento;
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

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public Integer getPlanoSaudeId() {
        return planoSaudeId;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

}

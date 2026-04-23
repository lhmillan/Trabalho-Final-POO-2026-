package br.com.serratec.model;

import br.com.serratec.interfaces.Tributavel;
import java.math.BigDecimal;
import java.time.LocalDate;

public class NotaFiscal implements Tributavel {

    private Integer id;
    private String nomeEmissor;
    private LocalDate dataEmissao;
    private String descricao;
    private BigDecimal valorBruto;
    private Integer faturaId;

    public NotaFiscal(Integer id, String nomeEmissor, LocalDate dataEmissao,
            String descricao, BigDecimal valorBruto, Integer faturaId) {
        this.id = id;
        this.nomeEmissor = nomeEmissor;
        this.dataEmissao = dataEmissao;
        this.descricao = descricao;
        this.valorBruto = valorBruto;
        this.faturaId = faturaId;
    }

    @Override
    public String toString() {
        return "NotaFiscal [id=" + id + ", nomeEmissor=" + nomeEmissor
                + ", dataEmissao=" + dataEmissao + ", descricao=" + descricao
                + ", valorBruto=" + valorBruto + "]";
    }

    public Integer getId() {
        return id;
    }

    public String getNomeEmissor() {
        return nomeEmissor;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValorBruto() {
        return valorBruto;
    }

    public Integer getFaturaId() {
        return faturaId;
    }

    @Override
    public BigDecimal calcularISS() {
        return valorBruto.multiply(new BigDecimal("0.03"));
    }

    @Override
    public BigDecimal calcularPIS() {
        return valorBruto.multiply(new BigDecimal("0.0065"));
    }

    @Override
    public BigDecimal calcularCOFINS() {
        return valorBruto.multiply(new BigDecimal("0.03"));
    }

    @Override
    public BigDecimal calcularIRPJ() {
        return valorBruto.multiply(new BigDecimal("0.012"));
    }

    @Override
    public BigDecimal calcularCSLL() {
        return valorBruto.multiply(new BigDecimal("0.0108"));
    }

    @Override
    public BigDecimal calcularTotalImpostos() {
        return calcularISS()
                .add(calcularPIS())
                .add(calcularCOFINS())
                .add(calcularIRPJ())
                .add(calcularCSLL());
    }

}

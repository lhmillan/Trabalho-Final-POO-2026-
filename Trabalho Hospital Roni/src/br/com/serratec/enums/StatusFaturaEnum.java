package br.com.serratec.enums;

public enum StatusFaturaEnum {
    PENDENTE("Pendente"),
    PAGO("Pago"),
    CANCELADO("Cancelado"),
    EM_ANALISE("Em Análise");

    private final String descricao;

    StatusFaturaEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

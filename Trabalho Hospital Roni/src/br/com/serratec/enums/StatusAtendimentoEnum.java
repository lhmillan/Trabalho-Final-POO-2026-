package br.com.serratec.enums;

public enum StatusAtendimentoEnum {
    REALIZADO("Realizado"),
    CANCELADO("Cancelado"),
    AGENDADO("Agendado");

    private final String descricao;

    StatusAtendimentoEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

package br.com.serratec.enums;

public enum ResultadoExameEnum {
    NORMAL("Normal"),
    ALTERADO("Alterado"),
    CRITICO("Crítico");

    private final String descricao;

    ResultadoExameEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

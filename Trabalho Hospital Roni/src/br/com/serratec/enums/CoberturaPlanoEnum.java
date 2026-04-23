package br.com.serratec.enums;

public enum CoberturaPlanoEnum {
    REGIONAL("Regional"),
    NACIONAL("Nacional");

    private final String descricao;

    CoberturaPlanoEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

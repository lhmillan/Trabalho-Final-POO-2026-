package br.com.serratec.enums;

public enum TipoLaboratorioEnum {
    INTERNO("Interno"),
    EXTERNO("Externo");

    private final String descricao;

    TipoLaboratorioEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

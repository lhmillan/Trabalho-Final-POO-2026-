package br.com.serratec.enums;

public enum TipoAtendimentoEnum {
    CONSULTA("Consulta"),
    EMERGENCIA("Emergência"),
    REVISAO("Revisão");

    private final String descricao;

    TipoAtendimentoEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

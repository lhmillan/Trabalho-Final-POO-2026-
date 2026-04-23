package br.com.serratec.enums;

public enum StatusLeitoEnum {
    LIVRE("Livre"),
    OCUPADO("Ocupado"),
    EM_MANUTENCAO("Em Manutenção");

    private final String descricao;

    StatusLeitoEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

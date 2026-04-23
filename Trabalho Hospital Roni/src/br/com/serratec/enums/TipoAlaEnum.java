package br.com.serratec.enums;

public enum TipoAlaEnum {
    UTI("UTI"),
    ENFERMARIA("Enfermaria"),
    PEDIATRIA("Pediatria");

    private final String descricao;

    private TipoAlaEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}

package br.com.serratec.enums;

public enum TipoExameEnum {
    SANGUE("Sangue"),
    IMAGEM("Imagem"),
    RAXIO_X("Raio-X"),
    ULTRASSOM("Ultrassom");

    private final String descricao;

    private TipoExameEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}

package br.com.serratec.model;

import br.com.serratec.enums.StatusLeitoEnum;

public class Leito {

    private Integer id;
    private String identificador;
    private StatusLeitoEnum status;
    private Ala ala;

    public Leito(Integer id, String identificador, StatusLeitoEnum status, Ala ala) {
        this.id = id;
        this.identificador = identificador;
        this.status = status;
        this.ala = ala;
    }

    @Override
    public String toString() {
        return "Leito [id=" + id + ", identificador=" + identificador + ", status=" + status + ", ala=" + ala + "]";
    }

    public Integer getId() {
        return id;
    }

    public String getIdentificador() {
        return identificador;
    }

    public StatusLeitoEnum getStatus() {
        return status;
    }

    public Ala getAla() {
        return ala;
    }

}

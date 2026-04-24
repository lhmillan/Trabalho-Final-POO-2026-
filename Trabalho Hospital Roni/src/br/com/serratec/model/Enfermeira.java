package br.com.serratec.model;

import br.com.serratec.enums.TurnoEnum;

public class Enfermeira {

    private Integer id;
    private String nome;
    private TurnoEnum turno;
    private Ala ala;
    private String cre;
    private Enfermeira enfermeiraChefeId;

    public Enfermeira(Integer id, String nome, TurnoEnum turno, Ala ala, String cre, Enfermeira enfermeiraChefeId) {
        this.id = id;
        this.nome = nome;
        this.turno = turno;
        this.ala = ala;
        this.cre = cre;
        this.enfermeiraChefeId = enfermeiraChefeId;
    }

    @Override
    public String toString() {
        return "Enfermeira [id=" + id + ", nome=" + nome + ", turno=" + turno + ", ala=" + ala + ", cre=" + cre
                + ", enfermeiraChefeId=" + enfermeiraChefeId + "]";
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public TurnoEnum getTurno() {
        return turno;
    }

    public Ala getAla() {
        return ala;
    }

    public String getCre() {
        return cre;
    }

    public Enfermeira getEnfermeiraChefeId() {
        return enfermeiraChefeId;
    }

}

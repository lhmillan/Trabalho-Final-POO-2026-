package br.com.serratec.model;

import java.util.List;

public class Ala {

    private Integer id;
    private Integer numLeitosDisponiveis;
    private Hospital hospital;
    private Enfermeira enfermeira;
    private List<Leito> leitos;

    public Ala(Integer id, Integer numLeitosDisponiveis, Hospital hospital, Enfermeira enfermeira) {
        this.id = id;
        this.numLeitosDisponiveis = numLeitosDisponiveis;
        this.hospital = hospital;
        this.enfermeira = enfermeira;
    }

    @Override
    public String toString() {
        return "Ala [id=" + id + ", numLeitosDisponiveis=" + numLeitosDisponiveis + ", hospital=" + hospital
                + ", enfermeira=" + enfermeira + "]";
    }

    public Integer getId() {
        return id;
    }

    public Integer getNumLeitosDisponiveis() {
        return numLeitosDisponiveis;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public Enfermeira getEnfermeira() {
        return enfermeira;
    }

}

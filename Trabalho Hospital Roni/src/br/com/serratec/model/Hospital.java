package br.com.serratec.model;

import java.util.List;

public class Hospital {

    private String cnpj;
    private String nome;
    private List<Ala> alas;
    private List<PlanoSaude> planos;
    private List<Medico> medicos;

    public Hospital(List<Ala> alas, String cnpj, List<Medico> medicos, String nome, List<PlanoSaude> planos) {
        this.alas = alas;
        this.cnpj = cnpj;
        this.medicos = medicos;
        this.nome = nome;
        this.planos = planos;
    }

    @Override
    public String toString() {
        return "Hospital [cnpj=" + cnpj + ", nome=" + nome + ", alas=" + alas + ", planos=" + planos + ", medicos="
                + medicos + "]";
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return nome;
    }

    public List<Ala> getAlas() {
        return alas;
    }

    public List<PlanoSaude> getPlanos() {
        return planos;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

}

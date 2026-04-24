package br.com.serratec.model;

import br.com.serratec.enums.CoberturaPlanoEnum;

public class PlanoSaude {

    private Integer id;
    private String nome;
    private CoberturaPlanoEnum cobertura;

    public PlanoSaude(Integer id, String nome, CoberturaPlanoEnum cobertura) {
        this.id = id;
        this.nome = nome;
        this.cobertura = cobertura;
    }

    @Override
    public String toString() {
        return "PlanoSaude [id=" + id + ", nome=" + nome + ", cobertura=" + cobertura + "]";
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public CoberturaPlanoEnum getCobertura() {
        return cobertura;
    }

}

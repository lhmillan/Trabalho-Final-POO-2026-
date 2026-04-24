package br.com.serratec.model;

import br.com.serratec.enums.TipoLaboratorioEnum;

public class Laboratorio {

    protected Integer id;
    protected String nome;
    protected TipoLaboratorioEnum tipo;

    public Laboratorio(Integer id, String nome, TipoLaboratorioEnum tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public TipoLaboratorioEnum getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Laboratorio [id=" + id + ", nome=" + nome + ", tipo=" + tipo + "]";
    }

}

package br.com.serratec.model;

public class Especialidade {

    private Integer id;
    private String nome;

    public Especialidade(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Especialidade [id=" + id + ", nome=" + nome + "]";
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

}

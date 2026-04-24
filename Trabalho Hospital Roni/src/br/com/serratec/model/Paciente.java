package br.com.serratec.model;

public class Paciente {

    private Integer id;
    private String nome;
    private String cpf;

    public Paciente(Integer id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Paciente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + "]";
    }

}

package br.com.serratec.model;

public abstract class Medicamento {

    protected String nome;

    public Medicamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Medicamento: " + nome;
    }

}

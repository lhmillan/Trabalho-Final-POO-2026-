package br.com.serratec.model;

import java.time.LocalDate;

public class Prescricao extends Medicamento {

    private Integer id;
    private LocalDate data;
    private String dosagemQuantidade;
    private Atendimento atendimento;

    public Prescricao(String nome, Integer id, LocalDate data, String dosagemQuantidade, Atendimento atendimento) {
        super(nome);
        this.id = id;
        this.data = data;
        this.dosagemQuantidade = dosagemQuantidade;
        this.atendimento = atendimento;
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public String getDosagemQuantidade() {
        return dosagemQuantidade;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    @Override
    public String toString() {
        return "Prescricao [id=" + id + ", data=" + data + ", dosagemQuantidade=" + dosagemQuantidade + ", atendimento="
                + atendimento + "]";
    }

}

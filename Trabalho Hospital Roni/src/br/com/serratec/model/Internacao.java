package br.com.serratec.model;

import java.time.LocalDate;

public class Internacao {

    private Integer id;
    private Leito leito;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private Paciente paciente;

    public Internacao(Integer id, Leito leito, LocalDate dataEntrada, LocalDate dataSaida, Paciente paciente) {
        this.id = id;
        this.leito = leito;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Internacao [id=" + id + ", leito=" + leito + ", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida
                + ", paciente=" + paciente + "]";
    }

    public Integer getId() {
        return id;
    }

    public Leito getLeito() {
        return leito;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public Paciente getPaciente() {
        return paciente;
    }

}

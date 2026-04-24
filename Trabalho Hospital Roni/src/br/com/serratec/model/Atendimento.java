package br.com.serratec.model;

import br.com.serratec.enums.StatusAtendimentoEnum;
import br.com.serratec.enums.TipoAtendimentoEnum;
import java.time.LocalDate;
import java.util.List;

public class Atendimento {

    private Integer id;
    private Paciente pacienteId;
    private TipoAtendimentoEnum tipo;
    private StatusAtendimentoEnum status;
    private String observacoes;
    private Medico medicoId;
    private LocalDate data;
    private List<Fatura> faturas;

    public Atendimento() {
    }

    public Atendimento(Integer id, Paciente pacienteId, TipoAtendimentoEnum tipo, StatusAtendimentoEnum status,
            String observacoes, Medico medicoId, LocalDate data) {
        this.id = id;
        this.pacienteId = pacienteId;
        this.tipo = tipo;
        this.status = status;
        this.observacoes = observacoes;
        this.medicoId = medicoId;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Atendimento [id=" + id + ", pacienteId=" + pacienteId + ", tipo=" + tipo + ", status=" + status
                + ", observacoes=" + observacoes + ", medicoId=" + medicoId + ", data=" + data + "]";
    }

    public Integer getId() {
        return id;
    }

    public Paciente getPacienteId() {
        return pacienteId;
    }

    public TipoAtendimentoEnum getTipo() {
        return tipo;
    }

    public StatusAtendimentoEnum getStatus() {
        return status;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public Medico getMedicoId() {
        return medicoId;
    }

    public LocalDate getData() {
        return data;
    }

    public List<Fatura> getFaturas() {
        return faturas;
    }

}

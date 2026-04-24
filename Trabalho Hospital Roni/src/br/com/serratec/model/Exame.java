package br.com.serratec.model;

import java.math.BigDecimal;

import br.com.serratec.enums.ResultadoExameEnum;
import br.com.serratec.enums.TipoExameEnum;
import java.time.LocalDate;

public class Exame {

    private Paciente paciente;
    private Laboratorio laboratorio;
    private String arquivo_lauda;
    private Medico medico;
    private TipoExameEnum tipo;
    private BigDecimal custo;
    private String descricao;
    private ResultadoExameEnum resultado;
    private LocalDate dataSolicitacao;
    private LocalDate dataResultado;

    public Exame(Paciente paciente, Laboratorio laboratorio, String arquivo_lauda, Medico medico, TipoExameEnum tipo,
            BigDecimal custo, String descricao, ResultadoExameEnum resultado, LocalDate dataSolicitacao,
            LocalDate dataResultado) {
        this.paciente = paciente;
        this.laboratorio = laboratorio;
        this.arquivo_lauda = arquivo_lauda;
        this.medico = medico;
        this.tipo = tipo;
        this.custo = custo;
        this.descricao = descricao;
        this.resultado = resultado;
        this.dataSolicitacao = dataSolicitacao;
        this.dataResultado = dataResultado;
    }

    @Override
    public String toString() {
        return "Exame [paciente=" + paciente + ", laboratorio=" + laboratorio + ", arquivo_lauda=" + arquivo_lauda
                + ", medico=" + medico + ", tipo=" + tipo + ", custo=" + custo + ", descricao=" + descricao
                + ", resultado=" + resultado + ", dataSolicitacao=" + dataSolicitacao + ", dataResultado="
                + dataResultado + "]";
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public String getArquivo_lauda() {
        return arquivo_lauda;
    }

    public Medico getMedico() {
        return medico;
    }

    public TipoExameEnum getTipo() {
        return tipo;
    }

    public BigDecimal getCusto() {
        return custo;
    }

    public String getDescricao() {
        return descricao;
    }

    public ResultadoExameEnum getResultado() {
        return resultado;
    }

    public LocalDate getDataSolicitacao() {
        return dataSolicitacao;
    }

    public LocalDate getDataResultado() {
        return dataResultado;
    }

}

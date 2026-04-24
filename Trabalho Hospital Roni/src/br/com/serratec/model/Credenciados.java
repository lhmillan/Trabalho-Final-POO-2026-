package br.com.serratec.model;

import java.time.LocalDate;
import java.util.List;

public class Credenciados {

    private List<Hospital> hospitais;
    private List<PlanoSaude> planoSaude;
    private LocalDate dataCredenciamento;

    public Credenciados(List<Hospital> hospitais, List<PlanoSaude> planoSaude, LocalDate dataCredenciamento) {
        this.hospitais = hospitais;
        this.planoSaude = planoSaude;
        this.dataCredenciamento = dataCredenciamento;
    }

    @Override
    public String toString() {
        return "Credenciados [hospitais=" + hospitais + ", planoSaude=" + planoSaude + ", dataCredenciamento="
                + dataCredenciamento + "]";
    }

    public List<Hospital> getHospitais() {
        return hospitais;
    }

    public List<PlanoSaude> getPlanoSaude() {
        return planoSaude;
    }

    public LocalDate getDataCredenciamento() {
        return dataCredenciamento;
    }

}

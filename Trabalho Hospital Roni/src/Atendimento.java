import java.io.ObjectInputFilter.Status;
import java.time.LocalDateTime;
import java.util.List;

public class Atendimento {
    private Medico medicoResp;
    private Paciente paciente;
    private TipoAtendimento tipo;
    private StatusAtendimento status;
    private String obs;
    private LocalDateTime registro;
    private Medicamentos medicamentos;
    private List<Fatura> faturas;
    
    public Atendimento(Medico medicoResp, Paciente paciente, TipoAtendimento tipo, StatusAtendimento status, String obs,
            LocalDateTime registro, Medicamentos medicamentos) {
        this.medicoResp = medicoResp;
        this.paciente = paciente;
        this.tipo = tipo;
        this.status = status;
        this.obs = obs;
        this.registro = registro;
        this.medicamentos = medicamentos;
    }

    public Medico getMedicoResp() {
        return medicoResp;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public TipoAtendimento getTipo() {
        return tipo;
    }

    public StatusAtendimento getStatus() {
        return status;
    }

    public String getObs() {
        return obs;
    }

    public LocalDateTime getRegistro() {
        return registro;
    }

    public Medicamentos getMedicamentos() {
        return medicamentos;
    }

    @Override
    public String toString() {
        return "Atendimento [medicoResp=" + medicoResp + ", paciente=" + paciente + ", tipo=" + tipo + ", status="
                + status + ", obs=" + obs + ", registro=" + registro + ", medicamentos=" + medicamentos + "]";
    }

    
    
}

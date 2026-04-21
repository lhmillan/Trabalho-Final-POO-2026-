import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Paciente {
    private final String cpf;
    private String nome;
    private Medico medicoResponsavel;

    public Paciente(String cpf, String nome, Medico medicoResponsavel) {
        this.cpf = cpf;
        this.nome = nome;
        this.medicoResponsavel = medicoResponsavel;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Medico getMedicoResponsavel() {
        return medicoResponsavel;
    }

    @Override
    public String toString() {
        return nome;
    }

}

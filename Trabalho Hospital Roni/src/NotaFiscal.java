import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

public class NotaFiscal {
    private Hospital nomeHospital;
    private Hospital cnpj;
    private Paciente paciente;
    private DecimalFormat df = new DecimalFormat("0.00");
    private String numero = java.util.UUID.randomUUID().toString().substring(0, 8);;
    private Fatura valor;
    private Fatura fatura;

    public NotaFiscal(Hospital nomeHospital, Paciente paciente, Fatura valor, Hospital cnpj, Fatura fatura) {
        this.nomeHospital = nomeHospital;
        this.paciente = paciente;
        this.valor = valor;
        this.cnpj = cnpj;
        this.fatura = fatura;
    }

    public Hospital getCnpj() {
        return cnpj;
    }

    public Hospital getNomeHospital() {
        return nomeHospital;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Fatura getValor() {
        return valor;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Nota Nº: "
                + numero + "| Paciente: " + paciente + "| Valor: R$" + valor;
    }

  

}

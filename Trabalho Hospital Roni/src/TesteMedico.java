import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TesteMedico {
    public static void main(String[] args) {

        Hospital h1 = new Hospital("79.364.740/0001-67", "Hospital Santa Maria");

        Medico m1 = new Medico("Vinicius", "Anestesista", "1234512M");
        Medico m2 = new Medico("Zeca", "Cardiologista", "12544841A");
        
        Enfermeira e1 = new Enfermeira("1241298ZM", "Maria", Turno.MANHA, TipoAla.ANESTESIA);
        
        Paciente p1 = new Paciente("12390865632", "Rogério", m2);
        Paciente p2 = new Paciente("16456823120", "Maxwell", m1);

        h1.addMed(m1);
        h1.addMed(m2);
        h1.mostrarMed();

        Atendimento a1 = new Atendimento(m2, p1, TipoAtendimento.CONSULTA, StatusAtendimento.REALIZADO, "Consulta cardiovascular periodica.", LocalDateTime.of(2025, 12, 10, 13, 12), null);
        Atendimento a2 = new Atendimento(m1, p2, TipoAtendimento.REVISÃO, StatusAtendimento.AGENDADO, "Revisão", null, null);        
        Fatura f1 = new Fatura(LocalDate.now(), LocalDate.of(2026, 05, 21), new BigDecimal(6000), StatusFatura.EMANÁLISE, FormaPagamento.DEBITO);

        NotaFiscal nf = new NotaFiscal(h1, p1, f1, h1, f1);
        f1.geraNota(nf,f1);
        f1.salvarNota(nf);
        // System.out.println(e1);
        // System.out.println(TipoExame.IMAGEM.getValor());

        f1.mostrarNotas();
    }
}

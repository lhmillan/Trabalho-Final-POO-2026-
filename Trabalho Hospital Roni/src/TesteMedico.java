import java.math.BigDecimal;
import java.time.LocalDate;



public class TesteMedico {
    public static void main(String[] args) {
        
        Hospital h1 = new Hospital("79.364.740/0001-67", "Hospital Santa Maria");
        Medico m1 = new Medico("Vinicius", "Anestesista", "1234512M");
        Medico m2 = new Medico("Zeca", "Cardiologista", "12544841A");
        Enfermeira e1 = new Enfermeira("1241298ZM", "Maria", Turno.MANHA , TipoAla.ANESTESIA);
        

        h1.addMed(m1);
        h1.addMed(m2);
        h1.mostrarMed();

        Paciente p1 = new Paciente("12390865632", "Rogério", m2);
        
        Fatura f1 = new Fatura(LocalDate.now(), LocalDate.of(2026, 05, 21) , StatusFatura.EMANÁLISE);
        f1.geraNota(h1,new BigDecimal(5000));
        System.out.println(e1);
        System.out.println(TipoExame.IMAGEM.getValor());
        
    }
}

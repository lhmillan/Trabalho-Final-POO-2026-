import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Random;

import javax.swing.JOptionPane;

public class Fatura {
    private LocalDate dataEmissao;
    private LocalDate dataVenc;
    private StatusFatura statusF;
    private BigDecimal valor;

    

    public Fatura(LocalDate dataEmissao, LocalDate dataVenc, StatusFatura statusF) {
        this.dataEmissao = dataEmissao;
        this.dataVenc = dataVenc;
        this.statusF = statusF;
        
    }



    public void geraNota(Hospital hospital, BigDecimal valor) {
        Random r = new Random();
        int numFat = r.nextInt(1, 999999999);
        JOptionPane.showMessageDialog(null, "NOTA Nº" + numFat + "\nPrestador de Serviço:"
                + hospital.getNome() + "\n" + hospital.getCnpj()+"\n"+valor);

    }

}

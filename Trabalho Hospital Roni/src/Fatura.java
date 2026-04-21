import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.Normalizer.Form;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class Fatura implements Financeiro {
    private Integer numero;
    private LocalDate dataEmissao;
    private LocalDate dataVenc;
    private StatusFatura statusF;
    private BigDecimal valor;
    private List<NotaFiscal> nfs = new ArrayList<>();
    private FormaPagamento pagamento;
    

    public Fatura(LocalDate dataEmissao, LocalDate dataVenc, StatusFatura statusF, FormaPagamento pagamento) {
        this.dataEmissao = dataEmissao;
        this.dataVenc = dataVenc;
        this.statusF = statusF;
        this.pagamento = pagamento;

    }

    @Override
    public void geraNota(NotaFiscal nf) {
        Random r = new Random();
        int numFat = r.nextInt(1, 999999999);
        DecimalFormat df = new DecimalFormat("0.00");
        BigDecimal iss = new BigDecimal("0.03");
        BigDecimal pis = new BigDecimal("0.0065");
        BigDecimal cofins = new BigDecimal("0.03");
        BigDecimal irpj = new BigDecimal("0.012");
        BigDecimal csll = new BigDecimal("0.0108");

        JOptionPane.showMessageDialog(null, "NOTA Nº" + nf.getNumero() + "\nPrestador de Serviço: "
                + nf.getNomeHospital() + "\n\nValores da Nota\n"
                + "Valor bruto do serviço: R$" + nf.getValor() + "\nISS\nAliquota:3%\nValor:R$ " + df.format(nf.getValor().multiply(iss))
                + "\n\nPIS\nAlíquota:0,65%\nValor: R$" + df.format(nf.getValor().multiply(pis)) + "\n\nCOFINS\nAlíquota: 3%\n"
                + "Valor: R$" + df.format(nf.getValor().multiply(cofins)) + "\n\nIPRJ\nAlíquota: 1,2%\n"
                + "Valor: R$" + df.format(nf.getValor().multiply(irpj)) + "\n\nCSLL\nAlíquota: 1,08%\n"
                + "Valor: R$" + df.format(nf.getValor().multiply(csll)));
    }

    @Override
    public void salvarFatura() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'salvarFatura'");
    }

    @Override
         public void salvarNota(NotaFiscal nf) {
        nfs.add(nf);
    }
        public void mostrarNotas(){
            for (NotaFiscal nf : nfs) {
                System.out.println(nf);
            }
            }
        }

 



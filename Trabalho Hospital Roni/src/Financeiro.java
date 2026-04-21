import java.math.BigDecimal;

public interface Financeiro {

    void geraNota(NotaFiscal nf,Fatura fatura);

    void salvarFatura();

    void salvarNota(NotaFiscal nf);

}

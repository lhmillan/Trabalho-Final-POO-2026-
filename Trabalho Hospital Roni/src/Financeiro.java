import java.math.BigDecimal;

public interface Financeiro {

    void geraNota(NotaFiscal nf);

    void salvarFatura();

    void salvarNota(NotaFiscal nf);

}

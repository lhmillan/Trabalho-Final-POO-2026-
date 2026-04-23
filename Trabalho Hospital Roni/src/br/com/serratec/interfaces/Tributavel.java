package br.com.serratec.interfaces;

import java.math.BigDecimal;

public interface Tributavel {

    BigDecimal calcularISS();

    BigDecimal calcularPIS();

    BigDecimal calcularCOFINS();

    BigDecimal calcularIRPJ();

    BigDecimal calcularCSLL();

    BigDecimal calcularTotalImpostos();

}

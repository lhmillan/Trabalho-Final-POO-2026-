package br.com.serratec.interfaces;

import java.math.BigDecimal;

public interface Tributos {

    BigDecimal calcularISS();

    BigDecimal calcularPIS();

    BigDecimal calcularCOFINS();

    BigDecimal calcularIRPJ();

    BigDecimal calcularCSLL();

    BigDecimal calcularTotalImpostos();

}

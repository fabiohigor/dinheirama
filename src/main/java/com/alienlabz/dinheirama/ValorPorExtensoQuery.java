package com.alienlabz.dinheirama;

import javax.money.MonetaryAmount;
import javax.money.MonetaryQuery;
import java.math.BigDecimal;

/**
 * Query para obter o  valor por extenso de um MonetaryAmount.
 * Estamos usando a implementação que está disponível em
 * https://github.com/mcrisc/porextenso.
 *
 * Todos os méritos pela lógica da implementação vão para ele, pois
 * foi realizada apenas mudanças para tratar um valor MonetaryAmount.
 *
 * @author Marlon Silva Carvalho
 * @since 1.0
 */
public class ValorPorExtensoQuery implements MonetaryQuery<String> {

    public String queryFrom(MonetaryAmount amount) {
        if(!"BRL".equals(amount.getCurrency().getCurrencyCode())) {
            throw new IllegalArgumentException("O valor monetário deve ser em reais.");
        }

        CurrencyWriter writer = CurrencyWriter.getInstance();
        BigDecimal valor = BigDecimal.valueOf(amount.getNumber().doubleValue());
        return writer.write(valor);
    }

}

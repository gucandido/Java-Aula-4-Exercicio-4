package com.classes;

import java.math.BigDecimal;

public class Clt extends Funcionario {

    private BigDecimal salarioBase;
    private double percentualBonificacao;

    public Clt( BigDecimal salarioBase, double percentualBonificacao, Cargo cargo) {
        super(cargo);
        this.salarioBase = salarioBase;
        this.percentualBonificacao = percentualBonificacao;
    }

    @Override
    public BigDecimal pagarSalario() {

        BigDecimal bonus = BigDecimal.valueOf(this.salarioBase.doubleValue() * (this.percentualBonificacao/100));

        return BigDecimal.valueOf(this.salarioBase.doubleValue() + bonus.doubleValue());

    }

    @Override
    public String toString() {
        return this.getCargo()+":" +
                "\n\tsalarioBase=" + salarioBase +
                "\n\tpercentualBonificacao=" + percentualBonificacao;
    }

}

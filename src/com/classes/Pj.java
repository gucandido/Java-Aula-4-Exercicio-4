package com.classes;

import java.math.BigDecimal;

public class Pj extends Funcionario{

    private BigDecimal valorHora;
    private double horasTrabalhadas = 0;

    public Pj(BigDecimal valorHora, Cargo cargo) {
        super(cargo);
        this.valorHora = valorHora;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public BigDecimal pagarSalario() {
        return BigDecimal.valueOf(this.valorHora.doubleValue() * this.horasTrabalhadas);
    }

    @Override
    public String toString() {
        return this.getCargo()+":" +
                "\n\tvalorHora= " + valorHora;
    }
}

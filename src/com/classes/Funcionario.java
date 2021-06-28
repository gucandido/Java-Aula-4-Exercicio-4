package com.classes;

import java.math.BigDecimal;

public abstract class Funcionario {

    private Cargo cargo;

    public String getCargo(){
        return this.cargo.toString();
    }

    public Funcionario(Cargo cargo) {
        this.cargo = cargo;
    }

    public abstract BigDecimal pagarSalario();

}

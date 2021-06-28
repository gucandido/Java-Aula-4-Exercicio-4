package com.company;

import com.classes.Cargo;
import com.classes.Clt;
import com.classes.Funcionario;
import com.classes.Pj;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        funcionarios.add(new Clt(BigDecimal.valueOf(3200.0),5, Cargo.Tecnico));
        funcionarios.add(new Clt(BigDecimal.valueOf(4000.0),8,Cargo.Analista));
        funcionarios.add(new Clt(BigDecimal.valueOf(6000.0),12.5,Cargo.Gerente));
        funcionarios.add(new Clt(BigDecimal.valueOf(15000.0),3,Cargo.Diretor));

        Pj pj = new Pj(BigDecimal.valueOf(65), Cargo.Prestador);
        pj.setHorasTrabalhadas(576);

        funcionarios.add(pj);

        for (Funcionario func: funcionarios) {

            System.out.println(func.toString());
            System.out.println("Pagamento de salario: "+ func.pagarSalario());
            System.out.println("---------------------------------------------\n");

        }


    }
}

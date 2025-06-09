package com.example.banco.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CORRIENTE")
public class CuentaCorriente extends Cuenta {


    public CuentaCorriente(String numero, String titular){ super(numero, titular);}

    @Override
    public void retirar(double monto) {

    }
}

package com.example.banco.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("AHORRO")
public class CuentaAhorro extends Cuenta {

    public CuentaAhorro(String numero, String titular) {
        super(numero, titular);
    }

    @Override
    public void retirar(double monto) {
        if(monto<= getSaldo()){
            setSaldo(getSaldo() - monto);
        } else {
            System.out.println("❌ Saldo insuficiente (Ahorro)");
        }
    }

}

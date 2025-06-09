package com.example.banco.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.STRING)
@Entity
@Getter
@Setter
@AllArgsConstructor // Constructor con todos los campos
public abstract class Cuenta {
    @Id
    private String numero;
    private String titular;
    private double saldo;

    public Cuenta(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }


    public abstract void retirar(double monto);

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        }
    }
}

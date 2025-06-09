package com.example.banco.service;

import com.example.banco.model.Cuenta;
import com.example.banco.model.CuentaAhorro;
import com.example.banco.repository.CuentaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CuentaService {
    private final CuentaRepository cuentaRepository;

    public CuentaService(CuentaRepository cuentaRepository) {
        this.cuentaRepository = cuentaRepository;
    }

    public Cuenta crearCuenta(Cuenta cuenta){
        return cuentaRepository.save(cuenta);
    }

    public Optional<Cuenta>buscarCuenta(String numero) {
        return cuentaRepository.findById(numero);
    }

}

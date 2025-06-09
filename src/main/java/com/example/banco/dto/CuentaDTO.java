package com.example.banco.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Objeto para crear cuentas (Corriente o Ahorro)")
public class CuentaDTO {
    @Schema(example = "01450012345", description = "Número único de cuenta")
    public String numero;

    @Schema(example = "Juan Pérez", description = "Nombre completo del titular")
    public String titular;

    @Schema(example = "2500.00", description = "Saldo inicial de la cuenta")
    public double saldo;

    @Schema(example = "CORRIENTE", description = "Tipo de cuenta: AHORRO o CORRIENTE")
    public String tipo;
}

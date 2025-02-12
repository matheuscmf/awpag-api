package com.algaworks.awpag.api.model.input;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ParcelamentoInput {

    @NotBlank
    @Size(max = 20)
    private String descriçao;
    @NotNull
    @Positive
    private BigDecimal valorTotal;
    @NotNull
    @Positive
    @Max(12)
    private Integer qtdParcelas;

    @Valid
    @NotNull
    private ClienteIdInput cliente;
}

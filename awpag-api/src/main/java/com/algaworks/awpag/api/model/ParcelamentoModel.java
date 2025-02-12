package com.algaworks.awpag.api.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Setter
@Getter
public class ParcelamentoModel {

    private Long id;
   // private String nomeCliente;
    private ClienteResumoModel cliente;
    private String descricao;
    private BigDecimal valorTotal;
    private Integer parcelas;
    private OffsetDateTime dataCriacao;

}

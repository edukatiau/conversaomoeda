package com.rigon.conversaomoeda.domain.dto;

import lombok.Data;

@Data
public class ResultadoDTO {
    
    private Double valorConvertido;
    private String moedaDestino;
}

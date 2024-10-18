package com.rigon.conversaomoeda.domain.wrapper;

import java.util.List;

import com.rigon.conversaomoeda.domain.entity.ValorMonetario;

import lombok.Data;

@Data
public class ValoresWrapper {
    
    private List<ValorMonetario> valores;

}

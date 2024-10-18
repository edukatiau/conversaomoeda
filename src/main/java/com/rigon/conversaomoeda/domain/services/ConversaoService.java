package com.rigon.conversaomoeda.domain.services;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rigon.conversaomoeda.domain.entity.ValorMonetario;
import com.rigon.conversaomoeda.domain.wrapper.ValoresWrapper;

@Service
public class ConversaoService {
    
    private static final Double DOLAR = 5.0;
    private static final Double EURO = 6.0;

    private static HashMap<String, Double> moedas = new HashMap<String, Double>() {
        {
            put("USD_EUR", 1/DOLAR);
            put("USD_BRL", 1/DOLAR);
            put("EUR_USD", 1/EURO);
            put("EUR_BRL", 1/EURO);
            put("BRL_USD", DOLAR);
            put("BRL_EUR", EURO);
        }
    };

    public ValoresWrapper converter(ValoresWrapper valores) {
        List<ValorMonetario> valoresMonetarios = valores.getValores();
        
        for (ValorMonetario valorMonetario : valoresMonetarios) {
            String chave = valorMonetario.getMoedaOrigem() + "_" + valorMonetario.getMoedaDestino();
            Double taxa = moedas.get(chave);
            valorMonetario.setValor(valorMonetario.getValor() * taxa);
        }

        return valores;
        
    }
}

package com.rigon.conversaomoeda.domain.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rigon.conversaomoeda.domain.services.ConversaoService;
import com.rigon.conversaomoeda.domain.wrapper.ValoresWrapper;

@RestController
@RequestMapping("/api")
public class ConversaoController {
    
    private static final ConversaoService conversaoService = new ConversaoService();

    @PostMapping("converter-moeda")
    public ValoresWrapper converter(@RequestBody ValoresWrapper valores) {
        return conversaoService.converter(valores);
    }
}

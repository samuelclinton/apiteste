package com.samuelclinton.apiteste.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TesteController {

    @GetMapping("/sucesso")
    @ResponseStatus(HttpStatus.OK)
    public void sucesso() {
        log.info("Requisição recebida no endpoint [/sucesso]");
    }

    @GetMapping("/erro")
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public void erro() {
        log.info("Requisição recebida no endpoint [/erro]");
    }

}

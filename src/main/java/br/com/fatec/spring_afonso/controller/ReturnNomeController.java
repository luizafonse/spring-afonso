package br.com.fatec.spring_afonso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReturnNomeController {

    @GetMapping("/meu-nome")
    public String meuNome() {
        return "Afonso Luiz Soares Batista"; 
    }
}

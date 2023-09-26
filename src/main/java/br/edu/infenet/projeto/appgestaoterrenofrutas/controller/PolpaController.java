package br.edu.infenet.projeto.appgestaoterrenofrutas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PolpaController {

    @GetMapping(value = "/polpa/lista")
    public String telaPolpa() {
        return "polpa/lista";
    }
}

package br.edu.infenet.projeto.appgestaoterrenofrutas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EncomendaController {

    @GetMapping(value = "/encomenda/lista")
    public String telaProduto() {
        return "encomenda/lista";
    }
}

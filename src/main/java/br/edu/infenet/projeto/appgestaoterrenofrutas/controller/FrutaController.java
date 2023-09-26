package br.edu.infenet.projeto.appgestaoterrenofrutas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrutaController {

    @GetMapping(value = "/fruta/lista")
    public String telaFruta() {
        return "fruta/lista";
    }
}

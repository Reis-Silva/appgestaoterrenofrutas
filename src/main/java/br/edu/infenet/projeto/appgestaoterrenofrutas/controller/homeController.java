package br.edu.infenet.projeto.appgestaoterrenofrutas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    @GetMapping(value = "/")
    public String telaHome() {
        return "home";
    }
}

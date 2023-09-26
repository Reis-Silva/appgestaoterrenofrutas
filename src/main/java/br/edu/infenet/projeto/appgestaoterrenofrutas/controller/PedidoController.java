package br.edu.infenet.projeto.appgestaoterrenofrutas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PedidoController {

    @GetMapping(value = "/pedido/lista")
    public String telaPedido() {
        return "pedido/lista";
    }
}

package br.edu.infenet.projeto.appgestaoterrenofrutas.controller;

import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ClienteController {

    private List<Cliente> clientes;

    @GetMapping(value = "/cliente/lista")
    public String telaCliente(Model model) {

        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Julio", "00000000001", "teste1@gmail.com"));
        clientes.add(new Cliente("Cesar", "00000000002", "teste2@gmail.com"));
        clientes.add(new Cliente("Reis", "00000000003", "teste3@gmail.com"));

        model.addAttribute("listaCliente", clientes);

        return "cliente/lista";
    }
}

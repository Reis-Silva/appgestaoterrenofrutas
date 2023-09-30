package br.edu.infenet.projeto.appgestaoterrenofrutas.controller;

import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class PedidoController {

    Map<LocalDateTime, Pedido> mapaPedido = new HashMap<LocalDateTime, Pedido>();

    public Collection<Pedido> obterLista(){
        return mapaPedido.values();
    }

    public void incluir(Pedido pedido) {
        mapaPedido.put(pedido.getData(), pedido);
        System.out.println("[Pedido] Inclusão realizada com sucesso: " + pedido);
    }

    public void excluir(LocalDateTime data) {
        mapaPedido.remove(data);
    }

    @GetMapping(value = "/pedido/lista")
    public String telaLista(Model model) {

        model.addAttribute("listaPedido", obterLista());

        return "pedido/lista";
    }

    @GetMapping(value = "/pedido/{data}/excluir")
    public String exclusao(@PathVariable LocalDateTime data) {

        excluir(data);

        return "redirect:/pedido/lista";
    }
}

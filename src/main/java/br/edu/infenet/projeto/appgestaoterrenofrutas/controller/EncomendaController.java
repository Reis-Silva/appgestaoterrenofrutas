package br.edu.infenet.projeto.appgestaoterrenofrutas.controller;

import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Encomenda;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class EncomendaController {

    private Map<Integer, Encomenda> mapaEncomenda = new HashMap<Integer, Encomenda>();

    public Collection<Encomenda> obterLista(){
        return mapaEncomenda.values();
    }

    public void incluir(Encomenda encomenda) {
        mapaEncomenda.put(encomenda.getCodigo(), encomenda);
        System.out.println("[Encomenda] Inclusão realizada com sucesso: " + encomenda);
    }

    public void excluir(int codigo) {
        mapaEncomenda.remove(codigo);
    }

    @GetMapping(value = "/encomenda/lista")
    public String telaLista(Model model) {

        model.addAttribute("listaEncomenda", obterLista());

        return "encomenda/lista";
    }

    @GetMapping(value = "/encomenda/{codigo}/excluir")
    public String exclusao(@PathVariable int codigo) {

        excluir(codigo);

        return "redirect:/encomenda/lista";
    }
}

package br.edu.infenet.projeto.appgestaoterrenofrutas.controller;

import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Polpa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class PolpaController {

    private Map<Integer, Polpa> mapaPolpa = new HashMap<Integer, Polpa>();

    public Collection<Polpa> obterLista(){
        return mapaPolpa.values();
    }

    public void incluir(Polpa polpa) {
        mapaPolpa.put(polpa.getCodigo(), polpa);
        System.out.println("[Polpa] Inclusão realizada com sucesso: " + polpa);
    }

    public void excluir(int codigo) {
        mapaPolpa.remove(codigo);
    }

    @GetMapping(value = "/polpa/lista")
    public String telaLista(Model model) {

        model.addAttribute("listaPolpa", obterLista());

        return "polpa/lista";
    }

    @GetMapping(value = "/polpa/{codigo}/excluir")
    public String exclusao(@PathVariable int codigo) {

        excluir(codigo);

        return "redirect:/polpa/lista";
    }
}

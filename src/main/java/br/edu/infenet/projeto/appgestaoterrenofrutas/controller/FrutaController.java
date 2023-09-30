package br.edu.infenet.projeto.appgestaoterrenofrutas.controller;

import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Fruta;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class FrutaController {

    private Map<Integer, Fruta> mapaComida = new HashMap<Integer, Fruta>();

    public Collection<Fruta> obterLista(){
        return mapaComida.values();
    }

    public void incluir(Fruta comida) {
        mapaComida.put(comida.getCodigo(), comida);
        System.out.println("[fruta] Inclusão realizada com sucesso: " + comida);
    }

    public void excluir(int codigo) {
        mapaComida.remove(codigo);
    }

    @GetMapping(value = "/fruta/lista")
    public String telaLista(Model model) {

        model.addAttribute("listaComida", obterLista());

        return "fruta/lista";
    }

    @GetMapping(value = "/fruta/{codigo}/excluir")
    public String exclusao(@PathVariable int codigo) {

        excluir(codigo);

        return "redirect:/fruta/lista";
    }
}

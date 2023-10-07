package br.edu.infenet.projeto.appgestaoterrenofrutas.test;

import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Encomenda;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Order(3)
@Component
public class EncomendaLoader implements ApplicationRunner {
	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<Encomenda> encomendas = new ArrayList<Encomenda>();
		encomendas.add(new Encomenda(150f, LocalDateTime.now().plusDays(10), "Sorvete de Ovo Maltine", "Leite condesado com Chocolate e creme de leite", 8.00f, 7L));
		encomendas.add(new Encomenda(300f, LocalDateTime.now().plusDays(10), "Empadão", "Frango com massa de trigo e legumes", 10.0f, 8L));
		encomendas.add(new Encomenda(300f, LocalDateTime.now().plusDays(10), "Torta Doce", "Chocolate com pedaços de biscoito e amora", 10.00f, 9L));

		System.out.println("Pedido Solicitado: \n");

		for(Encomenda encomenda : encomendas) {
			System.out.println(encomenda.toString() + "\n");
		}
	}
}

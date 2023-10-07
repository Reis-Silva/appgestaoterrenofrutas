package br.edu.infenet.projeto.appgestaoterrenofrutas.test;

import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Fruta;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Produto;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Order(1)
@Component
public class FrutaLoader implements ApplicationRunner {
	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<Fruta> frutas = new ArrayList<Fruta>();
		frutas.add(new Fruta(350f, true, LocalDateTime.now().plusDays(10), "Tomate, Cebola, Pepino, alface, Manga, Batata Doce", 15.50f, 4L));
		frutas.add(new Fruta(800f, false, LocalDateTime.now().plusDays(10), "Arroz Pasterizado, Peito de frango com molho Barbecue e alho Imerso ao queijo", 20.0f, 5L));
		frutas.add(new Fruta(600f, false, LocalDateTime.now().plusDays(10), "Molho mexicano com Carne de Filé em tiras e Carne de Porco ao molho Italiano", 50.00f, 6L));

		System.out.println(Produto.buscarSaudacaoAtual());

		System.out.println("Pedido Solicitado: \n");

		for(Fruta fruta : frutas) {
			System.out.println(fruta.toString() + "\n");
		}
	}
}

package br.edu.infenet.projeto.appgestaoterrenofrutas.test;

import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Cliente;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Fruta;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Pedido;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Produto;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Order(5)
@Component
public class PedidoLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		List<Produto> produtoList = new ArrayList<>();
		produtoList.add(new Fruta(350f, true, LocalDateTime.now().plusDays(10), "Tomate, Cebola, Pepino, alface, Manga, Batata Doce", 15.50f, 4));
		produtoList.add(new Fruta(800f, false, LocalDateTime.now().plusDays(10), "Arroz Pasterizado, Peito de frango com molho Barbecue e alho Imerso ao queijo", 20.0f, 5));
		produtoList.add(new Fruta(600f, false, LocalDateTime.now().plusDays(10), "Molho mexicano com Carne de Filé em tiras e Carne de Porco ao molho Italiano", 50.00f, 6));

		Pedido pedido = new Pedido("Pedido 1", new Cliente("Julio", "00000000001", "teste1@gmail.com"), (ArrayList<Produto>) produtoList);

		System.out.println("Pedido Solicitado: \n\n" + pedido.toString() + "\n");

		for(Produto produto : pedido.getProdutoList()) {
			System.out.println(produto.toString() + "\n");
		}

	}
}
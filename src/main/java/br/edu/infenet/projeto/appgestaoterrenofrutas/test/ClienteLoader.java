package br.edu.infenet.projeto.appgestaoterrenofrutas.test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Fruta;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Pedido;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Produto;
import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Cliente;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(4)
@Component
public class ClienteLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		List<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(new Cliente("Julio", "00000000001", "teste1@gmail.com"));
		clientes.add(new Cliente("Cesar", "00000000002", "teste2@gmail.com"));
		clientes.add(new Cliente("Reis", "00000000003", "teste3@gmail.com"));

		List<Pedido> pedidos = new ArrayList<Pedido>();
		pedidos.add(new Pedido("Pedido 1"));
		pedidos.add(new Pedido("Pedido 2"));
		pedidos.add(new Pedido("Pedido 3"));

		List<Fruta> frutas = new ArrayList<Fruta>();
		frutas.add(new Fruta(350f, true, LocalDateTime.now().plusDays(10), "Tomate, Cebola, Pepino, alface, Manga, Batata Doce", 15.50f, 4));
		frutas.add(new Fruta(800f, false, LocalDateTime.now().plusDays(10), "Arroz Pasterizado, Peito de frango com molho Barbecue e alho Imerso ao queijo", 20.0f, 5));
		frutas.add(new Fruta(600f, false, LocalDateTime.now().plusDays(10), "Molho mexicano com Carne de Filé em tiras e Carne de Porco ao molho Italiano", 50.00f, 6));

		System.out.println(Produto.buscarSaudacaoAtual());

		for(Cliente cliente : clientes ) {
			System.out.println("Solicitante: " + cliente.getNome() + "\n");

			for(Pedido pedido : pedidos) {
				System.out.println("Pedido Solicitado: \n");
				System.out.println(pedido.getDescricao() + "\n");

				for(Fruta fruta : frutas) {
					System.out.println(fruta.toString() + "\n");
				}
				System.out.println(pedido.toString() + "\n");
			}
		}
	}
}

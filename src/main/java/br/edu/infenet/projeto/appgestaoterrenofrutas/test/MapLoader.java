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

@Order(6)
@Component
public class MapLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
	}
}
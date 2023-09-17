package br.edu.infenet.projeto.appgestaoterrenofrutas.test;

import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Liquido;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Order(2)
@Component
public class LiquidoLoader implements ApplicationRunner {
	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<Liquido> liquidos = new ArrayList<Liquido>();
		liquidos.add(new Liquido(true, 350f, "Coca-Cola", "Refrigerante", 4.50f, 1));
		liquidos.add(new Liquido(false, 50f, "Jack Daniels Old 7", "Whisky", 20.0f, 2));
		liquidos.add(new Liquido(true, 350f, "RedBull", "Energético", 10.00f, 3));

		System.out.println(Liquido.buscarSaudacaoAtual());

		for(Liquido liquido : liquidos) {
			System.out.println(liquido.toString() + "\n");
		}
	}
}

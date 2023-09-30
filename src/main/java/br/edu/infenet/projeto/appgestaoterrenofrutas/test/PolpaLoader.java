package br.edu.infenet.projeto.appgestaoterrenofrutas.test;

import br.edu.infenet.projeto.appgestaoterrenofrutas.vo.Polpa;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Order(2)
@Component
public class PolpaLoader implements ApplicationRunner {
	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<Polpa> polpas = new ArrayList<Polpa>();
		polpas.add(new Polpa(true, 350f, "Coca-Cola", "Refrigerante", 4.50f, 1));
		polpas.add(new Polpa(false, 50f, "Jack Daniels Old 7", "Whisky", 20.0f, 2));
		polpas.add(new Polpa(true, 350f, "RedBull", "Energético", 10.00f, 3));

		System.out.println(Polpa.buscarSaudacaoAtual());

		for(Polpa polpa : polpas) {
			System.out.println(polpa.toString() + "\n");
		}
	}
}

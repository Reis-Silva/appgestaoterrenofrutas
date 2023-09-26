package br.edu.infenet.projeto.appgestaoterrenofrutas.vo;

import java.time.LocalDateTime;

public class Fruta extends Produto{

	private Float peso;

	private boolean pacote;

	private LocalDateTime validade;
	
	public Fruta(Float peso, boolean pacote, LocalDateTime validade, String nome, Float valor, Integer codigo) {
		super(nome, valor, codigo);
		this.peso = peso;
		this.pacote = pacote;
		this.validade = validade;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public boolean isPacote() {
		return pacote;
	}

	public void setPacote(boolean pacote) {
		this.pacote = pacote;
	}

	public LocalDateTime getValidade() {
		return validade;
	}

	public void setValidade(LocalDateTime validade) {
		this.validade = validade;
	}

	@Override
	public String toString() {
		return String.format("%s - Peso: %.2f - Pacote: %s - Validade: %s", super.toString(), peso, pacote, validade);
	}

}

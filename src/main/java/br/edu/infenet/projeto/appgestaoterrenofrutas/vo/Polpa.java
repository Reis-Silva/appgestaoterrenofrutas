package br.edu.infenet.projeto.appgestaoterrenofrutas.vo;

public class Polpa extends Produto {

	private boolean congelado;

	private Float quantidade;

	private String marca;

	public Polpa(boolean congelado, Float tamanho, String marca, String nome, Float valor, Integer codigo) {
		super(nome, valor, codigo);
		this.congelado = congelado;
		this.quantidade = tamanho;
		this.marca = marca;
	}

	public boolean isCongelado() {
		return congelado;
	}

	public void setCongelado(boolean congelado) {
		this.congelado = congelado;
	}

	public Float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Float quantidade) {
		this.quantidade = quantidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return String.format("%s - Congelado: %s - quantidade: %.2f - Marca: %s", super.toString(), congelado, quantidade, marca);
	}

}

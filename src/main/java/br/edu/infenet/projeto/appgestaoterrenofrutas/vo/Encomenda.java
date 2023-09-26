package br.edu.infenet.projeto.appgestaoterrenofrutas.vo;

import java.time.LocalDateTime;

public class Encomenda extends Produto{

	private Float quantidade;

	private LocalDateTime dataPossivelEntrega;

	private String informacoesExtras;
	
	public Encomenda(Float quantidade, LocalDateTime dataPossivelEntrega, String informacoesExtras, String nome, Float valor, Integer codigo) {
		super(nome, valor, codigo);
		this.quantidade = quantidade;
		this.dataPossivelEntrega = dataPossivelEntrega;
		this.informacoesExtras = informacoesExtras;
	}

	public Float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Float quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDateTime isDataPossivelEntrega() {
		return dataPossivelEntrega;
	}

	public void setDataPossivelEntrega(LocalDateTime dataPossivelEntrega) {
		this.dataPossivelEntrega = dataPossivelEntrega;
	}

	public String getInformacoesExtras() {
		return informacoesExtras;
	}

	public void setInformacoesExtras(String informacoesExtras) {
		this.informacoesExtras = informacoesExtras;
	}

	@Override
	public String toString() {
		return String.format("%s - Quantidade: %f.2 - Data Possível de entrega: %s - Informações Extras: %s", super.toString(), quantidade, dataPossivelEntrega, informacoesExtras);
	}

}

package br.edu.infenet.projeto.appgestaoterrenofrutas.vo;

import java.time.LocalDateTime;

public class Pedido {

	private String descricao;

	private LocalDateTime data;

	private boolean web;
	
	public Pedido(String descricao) {
		this.descricao = descricao;
		this.data = LocalDateTime.now();	
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}

	@Override
	public String toString() {
		return "descricao = " + descricao + ", data = " + data + ", web = " + (web ? "Sim" : "Não");
	}
}

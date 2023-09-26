package br.edu.infenet.projeto.appgestaoterrenofrutas.vo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class  Pedido {

	private String informacao;

	private LocalDateTime data;

	private boolean web;

	private Cliente cliente;

	private List<Produto> produtoList;

	public Pedido(String informacao) {
		this.informacao = informacao;
		this.data = LocalDateTime.now();
		this.web = true;
	}
	public Pedido(String informacao, Cliente cliente, ArrayList<Produto> produtoList) {
		this.informacao = informacao;
		this.data = LocalDateTime.now();
		this.web = true;
		this.cliente = cliente;
		this.produtoList = produtoList;
	}

	public String getInformacao() {
		return informacao;
	}

	public void setInformacao(String informacao) {
		this.informacao = informacao;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutoList() {
		return produtoList;
	}

	public void setProdutoList(List<Produto> produtoList) {
		this.produtoList = produtoList;
	}

	@Override
	public String toString() {
		return String.format("%s - Informação: %s - Data do Pedido: %s - Web: %s", cliente.toString(), informacao, data, web, produtoList.size());
	}
}

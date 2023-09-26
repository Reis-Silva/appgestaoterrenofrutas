package br.edu.infenet.projeto.appgestaoterrenofrutas.vo;

import java.util.Date;

public abstract class Produto {

	private String descricao;

	private Float valor;

	private Integer codigo;
	
	public Produto() {
	}

	public Produto(String descricao, Float valor, Integer codigo) {
		this.descricao = descricao;
		this.valor = valor;
		this.codigo = codigo;
	}
	
	public Produto(Produto produto) {
		this.descricao = produto.getDescricao();
		this.valor = produto.getValor();
		this.codigo = produto.getCodigo();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return String.format("Descrição: %s - Valor: %.2f - Codigo: %d", descricao, valor, codigo);
	}
	
	public static String buscarSaudacaoAtual() {
		
		String[] saudacao = new String[] {"Bom Dia", "Boa Tarde", "Boa Noite"};
		
		Date dataAtual = new Date();
		
		if(dataAtual.getHours() >= 0 && dataAtual.getHours() < 12) {
			return saudacao[0].toString();
		} else if (dataAtual.getHours() >= 12 && dataAtual.getHours() < 18) {
			return saudacao[1].toString();
		} else {
			return saudacao[2].toString();
		}
	}
}

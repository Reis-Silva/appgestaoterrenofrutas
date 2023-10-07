package br.edu.infenet.projeto.appgestaoterrenofrutas.vo;

import javax.persistence.*;

@Entity
@Table(name = "tbl_polpa")
public class Polpa extends Produto {

    private boolean congelado;

    private Float quantidade;

    private String marca;

    public Polpa() {
    }

    public Polpa(boolean congelado, Float tamanho, String marca, String nome, Float valor, Long codigo) {
        super(nome, valor, codigo);
        this.congelado = congelado;
        this.quantidade = tamanho;
        this.marca = marca;
    }

    public Polpa(Long id) {
        super(id);
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

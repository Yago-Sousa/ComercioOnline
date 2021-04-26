package br.com.model;

public class ProdutoModel {

	private Double valor;
	private int quantidade;
	private String descricao;
	private String nome;
		
	public ProdutoModel(Double valor, int quantidade, String descricao, String nome) {
		super();
		this.valor = valor;
		this.quantidade = quantidade;
		this.descricao = descricao;
		this.nome = nome;
	}
	
	
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}



	

	
}

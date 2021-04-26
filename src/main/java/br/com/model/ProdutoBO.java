package br.com.model;

import java.util.ArrayList;

public class ProdutoBO {

	ProdutoDAO produtoDAO = new ProdutoDAO();
	
	public void addProduto(ProdutoModel produto) {
		produtoDAO.addProduto(produto);
	}
	
	public void deletarProduto(String nome) {
		produtoDAO.deletarProduto(nome);
	}
	
	public ArrayList<ProdutoModel> showProduto(){
		return produtoDAO.showProduto();
	}
	
	public ArrayList<ProdutoModel> editarProduto(String nome) {
		return produtoDAO.editarProduto(nome);
	}
	
	public void editarFinalizar(String nome, String nomeAntigo, String descricao, int quantidade, double valor) {
		produtoDAO.editarFinalizar(nome, nomeAntigo, descricao, quantidade, valor);
	}
	
	
}

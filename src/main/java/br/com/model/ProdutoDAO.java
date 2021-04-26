package br.com.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProdutoDAO {

	private Connection connection;
	private PreparedStatement ps;
	private Statement st;
	private ResultSet rs;

	private ArrayList<ProdutoModel> produto = new ArrayList<ProdutoModel>();

	public ProdutoDAO() {
		connection = new ConnectionFactory().getConnection();
	}

	public void addProduto(ProdutoModel produto) {

		String sql = "INSERT INTO produtos(nome,descricao,quantidade,valor)values(?,?,?,?)";

		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, produto.getNome());
			ps.setString(2, produto.getDescricao());
			ps.setInt(3, produto.getQuantidade());
			ps.setDouble(4, produto.getValor());
			ps.execute();
			ps.close();
		} catch (Exception e) {
			System.out.println("Erro no INSERT " + e);
		}
	}

	public void deletarProduto(String nome) {

		String sql = "delete from produtos where nome=?";

		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, nome);
			ps.execute();
			ps.close();
		} catch (Exception e) {
			System.out.println("Erro no DELETAR " + e);
		}
		
	}
	

	public ArrayList<ProdutoModel> showProduto() {

		String sql = "SELECT * FROM produtos";

		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				produto.add(new ProdutoModel(rs.getDouble("valor"), rs.getInt("quantidade"), rs.getString("descricao"),
						rs.getString("nome")));
				
			}
		} catch (Exception e) {
			System.out.println("Erro no MOSTRAR PRODUTO " + e);
		}
		
		return produto;
	}




	public ArrayList<ProdutoModel> editarProduto(String nome) {

		String sql = "SELECT * FROM produtos where nome=?";

		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, nome);
			rs = ps.executeQuery();
			while (rs.next()) {
				produto.add(new ProdutoModel(rs.getDouble("valor"), rs.getInt("quantidade"), rs.getString("descricao"), rs.getString("nome")));
			}
		} catch (Exception e) {
			System.out.println("Erro no EDITAR PRODUTO " + e);
		}
		return produto;
	}

	public void editarFinalizar(String nome, String nomeAntigo, String descricao, int quantidade, double valor) {

		String sql = "update produtos set nome=?, descricao=?, quantidade=?, valor=?" + "where nome=?";
		try {

			ps = connection.prepareStatement(sql);
			ps.setString(1, nome);
			ps.setString(2, descricao);
			ps.setInt(3, quantidade);
			ps.setDouble(4, valor);
			ps.setString(5, nomeAntigo);
			ps.executeQuery();

		} catch (Exception e) {
			System.out.println("Erro no EDITAR FINALIZAR " + e);
		}

	}

}

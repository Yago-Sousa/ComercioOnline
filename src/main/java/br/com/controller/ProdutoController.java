package br.com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.model.ProdutoBO;
import br.com.model.ProdutoModel;



/**
 * Servlet implementation class ProdutoController
 */
@WebServlet("/ProdutoController")
public class ProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdutoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<ProdutoModel> produto = new ArrayList<ProdutoModel>();
		ProdutoBO produtoBO = new ProdutoBO();
		produto = produtoBO.showProduto();
		request.setAttribute("ArrayProduto", produto);
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ProdutoBO produtoBO = new ProdutoBO();
		String action = request.getParameter("action");

		if (action.equalsIgnoreCase("cadastrar")) {

			
			int quantidade = Integer.parseInt(request.getParameter("quantidade"));
			double valor = Double.parseDouble(request.getParameter("valor"));
			String nome = request.getParameter("nome");
			String descricao = request.getParameter("descricao");
			produtoBO.addProduto(new ProdutoModel(valor, quantidade, descricao, nome));
			request.getRequestDispatcher("index.jsp").forward(request, response);

		}
		
		if (action.equalsIgnoreCase("deletar")) {

			String nome = request.getParameter("nome");
			produtoBO.deletarProduto(nome);
			ArrayList<ProdutoModel> produto = new ArrayList<ProdutoModel>();
			produto = produtoBO.showProduto();
			request.setAttribute("ArrayProduto", produto);
			request.getRequestDispatcher("resultado.jsp").forward(request, response);

		}
		
		if (action.equalsIgnoreCase("editar")) {
			
			String nome = request.getParameter("nome");
			ArrayList<ProdutoModel> produto = new ArrayList<ProdutoModel>();
			produto = produtoBO.editarProduto(nome);
			request.setAttribute("ArrayProduto", produto);
			request.getRequestDispatcher("editar.jsp").forward(request, response);

		}
		
		if (action.equalsIgnoreCase("editarFinalizar")) {
			
			String nomeAntigo = request.getParameter("nomeAntigo");
			double valor = Double.parseDouble(request.getParameter("valor"));
			String nome = request.getParameter("nome");
			String descricao = request.getParameter("descricao");
			int quantidade = Integer.parseInt(request.getParameter("quantidade"));

			produtoBO.editarFinalizar(nome, nomeAntigo, descricao, quantidade, valor);
			
			request.getRequestDispatcher("editar.jsp").forward(request, response);

		}
		
		
		
	}

}

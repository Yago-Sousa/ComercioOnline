<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Comercio Online</title>
<link href="css/styles.css" rel="stylesheet" />
<link
	href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css"
	rel="stylesheet" crossorigin="anonymous" />
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js"
	crossorigin="anonymous"></script>
</head>
<body>
	<nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
		<a class="navbar-brand" href="index.html">E-commerce</a>
		<button class="btn btn-link btn-sm order-1 order-lg-0"
			id="sidebarToggle" href="#">
			<i class="fas fa-bars"></i>
		</button>

	</nav>



	<div id="layoutSidenav_content">
		<main>
			<div class="container-fluid">
				<h1 class="mt-4">Produtos</h1>
				<ol class="breadcrumb mb-4">
					<li class="breadcrumb-item active">[Lista de Produtos]</li>
				</ol>


				<div class="card mb-4">
					<div class="card-body">

						<div class="card mb-4">
							<div class="card-header">
								<i class="fas fa-table mr-1"></i> Tabela
							</div>
							<div class="card-body">
								<div class="table-responsive">
									<table class="table table-bordered" id="dataTable" width="100%"
										cellspacing="0">
										<thead>
											<tr>
												<th>Nome</th>
												<th>Descrição</th>
												<th>Quantidade</th>
												<th>Valor</th>
												<th>Editar / Excluir</th>
											</tr>
										</thead>
										<tfoot>
											<tr>
												<th>Nome</th>
												<th>Descrição</th>
												<th>Quantidade</th>
												<th>Valor</th>
												<th></th>
											</tr>
										</tfoot>

										<tbody>
											<c:forEach items="${ArrayProduto}" var="produto">
												<tr>
													<td>${produto.getNome()}</td>
													<td>${produto.getDescricao()}</td>
													<td>${produto.getQuantidade()}</td>
													<td>${produto.getValor()}</td>
													<td>
														<div style="display: inline-block;">
															<form action="ProdutoController?action=editar"
																method="post">
																<input type="hidden" id="nome" name="nome"
																	value="${produto.getNome()}">
																<button type="submit" class="btn btn-warning">Editar</button>
															</form>
														</div>
														<div style="display: inline-block;">
															<form action="ProdutoController?action=deletar"
																method="post">
																<input type="hidden" id="nome" name="nome"
																	value="${produto.getNome()}">
																<button type="submit" class="btn btn-danger">Deletar</button>
															</form>
														</div>
													</td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
						</div>

					</div>
				</div>



				<div style="height: 100vh"></div>

			</div>
		</main>
		<footer class="py-4 bg-light mt-auto">
			<div class="container-fluid">
				<div class="d-flex align-items-center justify-content-between small">
					<div class="text-muted">Copyright &copy; Comercio Online 2020</div>
					<div>
						<a href="#">Privacy Policy</a> &middot; <a href="#">Terms
							&amp; Conditions</a>
					</div>
				</div>
			</div>
		</footer>
	</div>


	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
		crossorigin="anonymous"></script>
	<script src="js/scripts.js"></script>
	<script
		src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js"
		crossorigin="anonymous"></script>
	<script src="assets/demo/datatables-demo.js"></script>

	<script src="js/scripts.js"></script>
</body>
</html>
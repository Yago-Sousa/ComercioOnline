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
					<li class="breadcrumb-item active">[Editar Produtos]</li>
				</ol>


				<div class="card mb-4">
					<div class="card-body">



						
							<form action="ProdutoController?action=editarFinalizar"
								method="post">

								<c:forEach items="${ArrayProduto}" var="produto">

									<div class="form-group">
										<label>Nome:</label> <input type="text" id="nome"
											name="nome" class="form-control" style="width: 25%"
											value="${produto.getNome()}">
									</div>
									
									<div class="form-group">
										<label>Descri??o:</label> <input type="text" id="descricao"
											name="descricao" class="form-control" style="width: 25%"
											value="${produto.getDescricao()}">
									</div>
									
									<div class="form-group">
										<label>Quantidade:</label> <input type="number" id="quantidade"
											name="quantidade" class="form-control" style="width: 25%"
											value="${produto.getQuantidade()}">
									</div>
									
									<div class="form-group">
										<label>Valor:</label> <input type="text" id="valor"
											name="valor" class="form-control" style="width: 25%"
											value="${produto.getValor()}">
									</div>
									
									<input type="hidden" id="nomeAntigo" name="nomeAntigo"
										value="${produto.getNome()}">
										
									<button type="submit" class="btn btn-primary"
										style="float: center;">Salvar</button>
								</c:forEach>
							</form>
						





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
</body>
</html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="urlRoot" />
<!DOCTYPE html>
<html lang="es">
<head>
<title>SCIG</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<spring:url value="/recursos" var="urlrecursos"></spring:url>
<link href="${urlrecursos}/css/template.css" rel="stylesheet">
<link rel="stylesheet"
	href="${urlrecursos}/vendor/bootstrap/css/bootstrap.min.css">
<!-- Font Awesome CSS-->
<link rel="stylesheet"
	href="${urlrecursos}/vendor/font-awesome/css/font-awesome.min.css">
<!-- Fontastic Custom icon font-->
<link rel="stylesheet" href="${urlrecursos}/css/fontastic.css">
<!-- Google fonts - Ro

boto -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700">
<!-- jQuery Circle-->
<link rel="stylesheet"
	href="${urlrecursos}/css/grasp_mobile_progress_circle-1.0.0.min.css">
<!-- Custom Scrollbar-->
<link rel="stylesheet"
	href="${urlrecursos}/vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.css">
<!-- theme stylesheet-->
<link rel="stylesheet" href="${urlrecursos}/css/style.default.css"
	id="theme-stylesheet">
<!-- Custom stylesheet - for your changes-->
<link rel="stylesheet" href="${urlrecursos}/css/custom.css">
<!-- Favicon-->
<link rel="shortcut icon" href="${urlrecursos}/img/favicon.ico">
<link rel="stylesheet" href="${urlrecursos}/css/bootstrap-select.css">


<!-- Tweaks fo"WebContent/recursos/js/bootstrap-select.js"r older IEs-->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/gijgo@1.9.10/js/gijgo.min.js"
	type="text/javascript"></script>
<link href="https://cdn.jsdelivr.net/npm/gijgo@1.9.10/css/gijgo.min.css"
	rel="stylesheet" type="text/css" />
</head>
<body class="app sidebar-mini rtl">
	<div class="page">
		<jsp:include page="template/header.jsp"></jsp:include>
		<main class="app-content">
		<h1>soy almacen</h1>
		<section class="dashboard-counts section-padding">
			<div class="container-fluid">
				<%
					int i = 0;
				%>
				<div class="col-md-12">
					<div class="card">
						<form action="almacenbuscar" method="post">
							<div class="app-breadcrumb breadcrumb " style="">
								<div class="col-lg-5">
									<select class="selectpicker form-control input-material" id="combo"
										data-container="body" data-live-search="true"
										title="Selecciona un almacén" data-hide-disabled="true"
										name="idProducto">
										<c:forEach items="${listAlm}" var="alm">
											<option value="${alm.idalmacen}">${alm.abreviado}</option>>
									</c:forEach>
									</select>
								</div>
								<div class="col-auto">
									<input type="submit" class="btn btn-primary fa fa-plus"
										value="Buscar">
								</div>
							</div>
						</form>
						<div class="card-body"
							class="row justify-content-center align-items-center">
							<table class="table table-bordered" style="max-width: 800px;">
								<thead>
									<tr>
										<th scope="col">#</th>
										<th scope="col">Almacén</th>
										<th scope="col">Código</th>
										<th scope="col">Nombre</th>
										<th scope="col">Stock</th>
										<th scope="col">Ver</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${listaProd}" var="pro">
										<%
											i++;
										%>
										<tr>
											<th scope="row"><%=i%></th>
											<td>${pro.abreviado}</td>
											<td>${pro.codigo}</td>
											<td>${pro.nombre}</td>
											<td>${pro.stock}</td>
											<td><a href="#" style="color: blue;"><i
													class="fa fa-eye" aria-hidden="true"></i></a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
					<form role="form"></form>
				</div>
			</div>
		</section>
		</main>
	</div>
	<!-- Essential javascripts for application to work-->
	<!-- JavaScript files-->
	<script src="${urlrecursos}/vendor/jquery/jquery.min.js"></script>
	<script src="${urlrecursos}/vendor/jquery/jquery.min.js"></script>
	<script src="${urlrecursos}/vendor/popper.js/umd/popper.min.js"></script>

	<script src="${urlrecursos}/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script
		src="${urlrecursos}/js/grasp_mobile_progress_circle-1.0.0.min.js"></script>
	<script src="${urlrecursos}/vendor/jquery.cookie/jquery.cookie.js">
		
	</script>
	<script src="${urlrecursos}/vendor/chart.js/Chart.min.js"></script>
	<script
		src="${urlrecursos}/vendor/jquery-validation/jquery.validate.min.js"></script>
	<script
		src="${urlrecursos}/vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js"></script>
	<script src="${urlrecursos}/js/charts-home.js"></script>
	<!-- Main File-->
	<script src="${urlrecursos}/js/front.js"></script>
	<script src="${urlrecursos}/js/bootstrap-select.js"></script>
	<script src="${urlrecursos}/js/bootstrap-select.min.js"></script>
	<!-- <script src="${urlrecursos}/js/bootstrap-select.js"></script>-->
	<!-- Google analytics script-->
	<script type="${urlrecursos}/text/javascript">
      if(document.location.hostname == 'pratikborsadiya.in') {
      	(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
      	(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
      	m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
      	})(window,document,'script','//www.google-analytics.com/analytics.js','ga');
      	ga('create', 'UA-72504830-1', 'auto');
      	ga('send', 'pageview');
      }
    </script>
</body>
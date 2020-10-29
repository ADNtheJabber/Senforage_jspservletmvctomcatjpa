<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>liste des villages</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
<jsp:include page="../inc/header.jsp"></jsp:include>

<div class="container col-md-10">
		<div class="panel panel-primary">
			<div class="panel-heading">
				Liste des villages
			</div>
			<div class="panel-body">
				<table class="table table-striped">
					<tr>
						<th>Id</th>
						<th>village</th>
						<th>Commune</th>
						<th>Region</th>
						<th>Actions</th>
					</tr>
				<c:forEach items="villages" var="village">
					<tr>
						<th>village.id</th>
						<th>village.nom</th>
						<th>village.commune</th>
						<th>village.region</th>
						<th>
							<i class="fa fa-user"><a href="editVillage"></a></i> |
							<i class="fa fa-user"><a href="deleteVillage"></a></i>
						</th>
					</tr>
				</c:forEach>
				</table>
			</div>
			<div class="panel-footer">
				<i class="fa fa-plus"></i><a href="addVillage">Ajouter un client</a>
			</div>
		</div>
</div>
	
<jsp:include page="../inc/footer.jsp"></jsp:include>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
<jsp:include page="../inc/header.jsp"></jsp:include>
<div class = "banner">
	<h1>Bienvenue dans senforage !</h1>
</div>	
<%= request.getSession().getAttribute("username") %>
<a href="LogoutServlet">Logout</a>|  

<div class="actions">
	<h3>Vous souhaitez ?</h3>
	
	<div class="container col-sm-4 col-md-6 col-xs-8">
		<div class="panel panel-primary">
			<div class="panel-heading">
				Ajouter un client
			</div>
			<div class="panel-body">
				<p>lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum</p>
			</div>
			<div class="panel-footer">
				<a href="addClient">Ajouter un client</a>
			</div>
		</div>
		
		<div class="panel panel-primary">
			<div class="panel-heading">
				Lister les clients
			</div>
			<div class="panel-body">
				<p>lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum</p>
			</div>
			<div class="panel-footer">
				<a href="listClient">Lister les clients</a>
			</div>
		</div>
		
		<div class="panel panel-primary">
			<div class="panel-heading">
				Ajouter un village
			</div>
			<div class="panel-body">
				<p>lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum</p>
			</div>
			<div class="panel-footer">
				<a href="addVillage">Ajouter un village</a>
			</div>
		</div>
		
		<div class="panel panel-primary">
			<div class="panel-heading">
				Lister les villages
			</div>
			<div class="panel-body">
				<p>lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum</p>
			</div>
			<div class="panel-footer">
				<a href="listVillage">Lister les villages</a>
			</div>
		</div>
	</div>
</div>

<jsp:include page="../inc/header.jsp"></jsp:include>
</body>
</html>
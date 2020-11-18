<jsp:include page="../../../inc/header.jsp"></jsp:include>

<title>liste des clients</title>

<div class="container col-md-10">
		<div class="panel panel-primary">
			<div class="panel-heading">
				Liste des clients
			</div>
			<div class="panel-body">
				<table class="table table-striped">
					<tr>
						<th>Id</th>
						<th>Prénom (s)</th>
						<th>Nom</th>
						<th>Date et Lieu de Naissance</th>
						<th>CNI</th>
						<th>Telephone</th>
<!-- 						<th>Résidence</th> -->
						<th>Actions</th>
					</tr>
				<c:forEach items="${clients}" var="client">
					<tr>
						<td><c:out value="${client.client_id}"/></td>
						<td><c:out value="${client.prenom}"/></td>
						<td><c:out value="${client.nom}"/></td>
						<td><c:out value="${client.dateNaiss}"/> | <c:out value="${client.lieuNaiss}"/></td>
						<td><c:out value="${client.cni}"/></td>
						<td><c:out value="${client.tel}"/></td>
						<th>
							<i class="fa fa-user"><a href="editClient"></a></i> |
							<i class="fa fa-user"><a href="deleteClient"></a></i>
						</th>
					</tr>
				</c:forEach>
				</table>
			</div>
			<div class="panel-footer">
				<i class="fa fa-plus"></i><a href="addClient">Ajouter un client</a>
			</div>
		</div>
</div>
	
<jsp:include page="../../../inc/footer.jsp"></jsp:include>
</body>
</html>
<jsp:include page="../../../inc/header.jsp"></jsp:include>

<title>liste des villages</title>

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
				<c:forEach items="${villages}" var="village">
					<tr>
						<td><c:out value="${village.village_id}"/></td>
						<td><c:out value="${village.nom}"/></td>
						<td><c:out value="${village.commune}"/></td>
						<td><c:out value="${village.region}"/></td>
						<th>
							<i class="fa fa-user"><a href="editVillage"></a></i> |
							<i class="fa fa-user"><a href="deleteVillage"></a></i>
						</th>
					</tr>
				</c:forEach>
				</table>
			</div>
			<div class="panel-footer">
				<i class="fa fa-plus"></i><a href="addVillage">Ajouter un village</a>
			</div>
		</div>
</div>
	
<jsp:include page="../../../inc/footer.jsp"></jsp:include>
</body>
</html>
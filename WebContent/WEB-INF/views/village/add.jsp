<jsp:include page="../../../inc/header.jsp"></jsp:include>

<title>ajouter un village</title>

<div class="container" style="margin-top: 80px">

<div class="card bg-light">
	<h4 class="card-title mt-3 text-center">Creer un village</h4>
	
	<form method="POST" action="addVillage">
		<div class="form-group input-group">
			<div class="input-group-prepend">
			    <span class="input-group-text"> <i class="fa fa-building"></i> </span>
			 </div>
	        <input name="nom" class="form-control" placeholder="nom du village" type="text">
	        
	        <div class="input-group-prepend">
			    <span class="input-group-text"> <i class="fa fa-map-marker-alt"></i> </span>
			 </div>
	        <input name="commune" class="form-control" placeholder="commune" type="text">
	    </div>
	    <div class="form-group input-group">
			<div class="input-group-prepend">
			    <span class="input-group-text"> <i class="fa fa-map-marker-alt"></i> </span>
			 </div>
	        <input name="region" class="form-control" placeholder="Region" type="text">
	    </div>
	    </div>  
	                                              
	    <div class="input-group" style="width: 150px; margin: auto">
	        <button type="submit" class="btn btn-success btn-block"> Valider </button>
	        <button type="reset" class="btn btn-danger btn-block"> Annuler </button>
	    </div>                                                                
		<div> 
			<i class="fa fa-plus"></i><a href="listVillage">Revenir à la liste des villages</a>
		</div>
 	</form>
</div>

</div> 

<jsp:include page="../../../inc/footer.jsp"></jsp:include>
</body>
</html>

<jsp:include page="../../../inc/header.jsp"></jsp:include>

<title>ajouter un client</title>

<div class="container" style="margin-top: 80px">

<div class="card bg-light">
	<h4 class="card-title mt-3 text-center">Creer un client</h4>
	
	<form method="POST" action="addClient">
		<div class="form-group input-group">
			<div class="input-group-prepend">
			    <span class="input-group-text"> <i class="fa fa-user"></i> </span>
			 </div>
	        <input name="prenom" class="form-control" placeholder="prenom" type="text">
	        
	        <div class="input-group-prepend">
			    <span class="input-group-text"> <i class="fa fa-user"></i> </span>
			 </div>
	        <input name="nom" class="form-control" placeholder="nom" type="text">
	    </div>
	    <div class="form-group input-group">
			<div class="input-group-prepend">
			    <span class="input-group-text"> <i class="fa fa-calendar"></i> </span>
			 </div>
	        <input name="dateNaissance" class="form-control" placeholder="date de naissance" type="date">
	        
	        <div class="input-group-prepend">
			    <span class="input-group-text"> <i class="fa fa-map-marker-alt"></i> </span>
			 </div>
	        <input name="lieuNaissance" class="form-control" placeholder="lieu de naissance" type="text">
	    </div>
	    <div class="form-group input-group">
	    	<div class="input-group-prepend">
			    <span class="input-group-text"> <i class="fa fa-envelope"></i> </span>
			 </div>
	        <input name="email" class="form-control" placeholder="Adresse email" type="email">
	        <div class="input-group-prepend">
			    <span class="input-group-text"> <i class="fa fa-phone"></i> </span>
			</div>
			<input name="tel" class="form-control" placeholder="Telephone : +221 " type="text">
	    </div>
	    <div class="form-group input-group">
	    	<div class="input-group-prepend">
			    <span class="input-group-text"> <i class="fa fa-id-card"></i> </span>
			 </div>
	        <input name="cni" class="form-control" placeholder="numero d'identification nationale" type="text">
	    	<div class="input-group-prepend">
			    <span class="input-group-text"> <i class="fa fa-building"></i> </span>
			</div>
			<select class="form-control"">
				<option selected=""> Village : </option>
				<option>Designer</option>
				<option>Manager</option>
				<option>Accaunting</option>
			</select>
	    </div>  
	                                              
	    <div class="input-group" style="width: 150px; margin: auto">
	        <button type="submit" class="btn btn-success btn-block"> Valider </button>
	        <button type="reset" class="btn btn-danger btn-block"> Annuler </button>
	    </div>                                                                
		<div> 
			<a href="listClient">Revenir à la liste des clients</a>
		</div>
 	</form>
</div>

</div> 

<jsp:include page="../../../inc/footer.jsp"></jsp:include>
</body>
</html>
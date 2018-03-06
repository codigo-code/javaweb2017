function validarFormulario(){

	//selector en javaScript
	var pass = document.getElementById("password").value;
	var repass = document.getElementById("repassword").value;
	var form =document.getElementById("formulario");
	console.log(pass);
	console.log(repass);
	
	if(pass == repass){
		form.action="formulario";
		form.method="post";
		form.submit();
	}else{
		alert("La contraseña no es igual por favor verificar!");
	}
	
}


function loginUsuario(){
	var form = document.getElementById("loginForm");
	form.action="formulario";
	form.method="post";
	form.submit();
}


function changeView(){
	var reg = document.getElementById("registerDiv");
	var log = document.getElementById("loginDiv");


	if(reg.style.display == "block"){
		//Trabajo con el formulario de login
		reg.style.display = "none";
		log.style.display = "block";

		
	}else if(log.style.display == "block"){
		//Trabajo con el formulario de registro
		reg.style.display = "block";
		log.style.display = "none";


	}
	
	
	
}
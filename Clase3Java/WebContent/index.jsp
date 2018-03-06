<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="js/script.js"></script>
</head>
<body>

<button onclick="changeView()"> display </button>

	<div id="registerDiv" style="display:block;">
		<h2>Formulario de registro</h2>
		<form id="formulario">
			<input type="hidden"  name="estado" value="nuevo" /> <input type="text" name="name"
				placeholder="nombre" /> </br> <input type="text" name="surname"
				placeholder="apellido" /> </br> <input type="email" name="email"
				placeholder="email" /> </br> <input type="text" name="user"
				placeholder="user" required /></br> <input type="password" id="password"
				name="password" placeholder="contraseña" required /></br> <input
				type="password" id="repassword" name="repassword"
				placeholder="re contraseña" required /></br>
		</form>
		<button onclick="validarFormulario()">Registrar</button>
	</div>
<br>
	<div id="loginDiv" style="display:none;">
		<h2>Ingresar</h2>
		<form id="loginForm">
			<input type="hidden"  name="estado" value="login"/> <input type="text" name="user"
				id="user" placeholder="usuario" required /></br> <input type="password"
				name="password" id="password" placeholder="contraseña" required /></br>
		</form>
		<button onclick="loginUsuario()">Log in!</button>
	</div>

</body>
</html>








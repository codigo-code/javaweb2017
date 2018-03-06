<%@page import="com.utn.modelo.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%

	if(session.getAttribute("usuario") == null){
		response.sendRedirect("error.jsp");
	}else{
		Usuario u  = (Usuario) session.getAttribute("usuario");
		
	


%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Bienvenido <%=u.getName() %>  </h1>

<%= session.getMaxInactiveInterval() %>
</body>
</html>



<%
	}
%>


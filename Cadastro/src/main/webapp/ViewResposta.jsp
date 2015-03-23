<%@page import = "clientes.Cliente" %>
<%@page import = "java.util.List" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cliente Cadastrado</title>
</head>
<body>

		<h1>Lista de Clientes Cadastrados</h1>
	<%
		List<Cliente> clientes = (List<Cliente>) request.getAttribute("clients");
			int num =1 ;
		
		for(Cliente c: clientes){
			
			out.print("<h2>Cliente numero  "+num+"<p><p></h2>");
			out.print("Nome : "+c.getNome()+"<p>");
			out.print("Ra : "+c.getRa()+"<p>");
			out.print("Sexo: "+c.getSexo()+"<p>");
			out.print("Estado : "+c.getEstado()+"<p>");
			num++;
			
		}
	%>


</body>
</html>
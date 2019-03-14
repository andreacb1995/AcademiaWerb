<%@ page import="java.util.ArrayList" %>
<%@ page import="com.aulaestudio.models.Alumno" %><%--
  Created by IntelliJ IDEA.
  User: tomas
  Date: 28/02/2019
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    ArrayList<Alumno> al=(ArrayList<Alumno>) request.getAttribute("alumnos");//desde el servlet,antes de cargar la
    //pagina estoy metiendo los alumnos.
%>
<html>
<head>
    <title>Nuevo Alumno</title>
</head>
<body>
<form action="" method="post">
    <input type="text" name="nombre" placeholder="Nombre alumno">
    <input type="text" name="contrasenha" placeholder="Contraseña alumno">
    <input type="number" name="edad" placeholder="Edad alumno">
    <input type="submit" value="Nuevo alumno">
</form>
<%
for(Alumno alumno:al){
%>
<%="<div>" + alumno.toString()+"<div>"%>
<% }
%>
</body>
</html>

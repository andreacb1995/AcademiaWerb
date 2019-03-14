<%@ page import="com.aulaestudio.models.Alumno" %><%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Academia web</title>
  </head>
  <body>
      <h1>Academia web</h1>
  <p>Mi primera aplicación web</p>
  <% Alumno al=new Alumno("Pedro","2342341",34); %>
  <%=al.toString()%>
  </body>
</html>
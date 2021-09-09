<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>   <!--  activa EL - expresion lenguage -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>saludo</title>
</head>
<body>
  <h2> Hola  ${ requestScope.nombre }!!!</h2>
  
  <!--  JSTL Java Standar Tag Libs -->
  <c:if test="${requestScope.visible}">
 		 <div> soy visible </div>
  </c:if>
  
  <h3>Lista empleados</h3>
  <hr />
  <c:forEach items="${ requestScope.listaEmpleados }"
  			 var="empleado">
  		.  ${ empleado.id }	 ${ empleado.nombre }	 
        <br />
  </c:forEach>
  
  
</body>
</html>
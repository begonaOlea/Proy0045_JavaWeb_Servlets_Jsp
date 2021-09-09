<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form saludo</title>
</head>
<body>
<h1>Formulario saludo</h1>
	<form action="saludo" method="get">
		<label for="nombre">Nombre:</label>
		<input type="text" id="nombre" name="paramNombre" />
		<br />
		<input type="submit" value="SALUDAR" />
	</form>
</body>
</html>
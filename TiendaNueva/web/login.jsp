<%-- 
    Document   : login
    Created on : 09-jul-2019, 11:52:02
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="ccs/estilo.css" rel="stylesheet" type="text/css"/>
    </head>
  <body>
	<div id="cabecera">
		<!-- Logo -->
		<div id="logo">
			<a href="inicio.html"></a>
		</div>	
		<!-- Slogan -->
		<p class="htit">G I F T - S H O P</p>
		<!-- Main Menu -->
		<div id="menu">
			<a class="menu_login" href="login.jsp">Login</a>
			<a class="menu_inicio" href="index.jsp">Inicio</a>
			<a class="menu_historial" href="historial.html">Historial</a>
			<a class="menu_directorio" href="#">lista favoritos</a>
		</div>
	</div>

<!-- Main Container -->
<div id="cnt">
	<div id="fondo">
		<div class="is">
		<div>Iniciar<span>Sesion</span></div>
		</div>
		<br>
		<div class="login">
                    <form action="login.jsp" method="POST">
			<input type="text" placeholder="usuario" name="user"><br>
			<input type="password" placeholder="password" name="password"><br>
			<input type="button" value="Login">
                        </form>
		</div>
		<div id="text">
		si aun no te has registrado has click
                    <form action="registro.jsp" method="POST">
			<input type="button" value="aqui">
                        </form>
                
		</div>
	</div>
	
</div>

<!-- Footer -->
	<div id="foo">
		<div id="foot_menu">
			<br><br><br>
			<span class="f_left">&copy; 2019 LuckyCat. Derechos reservados.</span>
		</div>
	</div>
</body>
</html>


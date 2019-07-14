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
		<div>Iniciar<span>registro</span></div>
		</div>
		<br>
		<div class="login">
                   <form action="ServletRegistro" method="POST">
                       email_name: <input type ="text" name="email_name" width="30"><br>
			password:<input type="password" name="password"width="10"><br>
			<input type="submit" value="registrar">
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


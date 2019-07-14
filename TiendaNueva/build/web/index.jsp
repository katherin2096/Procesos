<%-- 
    Document   : index
    Created on : 08-jul-2019, 22:52:50
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="ccs/estilo.css" rel="stylesheet" type="text/css"/>
   
 
<body>
	<div id="cabecera">
		<!-- Logo -->
		<div id="logo">
			<a href="inicio.html"></a>
		</div>	
		<!-- Slogan -->
		<p class="htit">GIFT - SHOP</p>
		<!-- Main Menu -->
		<div id="menu">
			<a class="menu_login" href="login.jsp">Login</a>
			<a class="menu_inicio" href="index.jsp">Inicio</a>
			<a class="menu_historial" href="historial.html">Historial</a>
			<a class="menu_directorio" href="#">Lista de deseos</a>
		</div>
	</div>

<!-- Menu -->
<div id="cnt2">
	
	<div id="contenedor">
		<input id="tab-1" type="radio" name="radio-set" class="tab-selector-1" checked="checked" />
		<label for="tab-1" class="tab-label-1">Usuario</label>
   
		<input id="tab-2" type="radio" name="radio-set" class="tab-selector-2" />
		<label for="tab-2" class="tab-label-2">Ultimas compras</label>
                           
		<input id="tab-3" type="radio" name="radio-set" class="tab-selector-3" />
		<label for="tab-3" class="tab-label-3">acualizar Dat</label>
	</div>   

	<div class="left_content">
		<div class="title_box">PRODUCTOS</div>
			<ul class="left_menu">
				<li class="odd"><a href="#">DAMAS</a></li>
				<li class="even"><a href="#">VARONES</a></li>
				<li class="odd"><a href="#">NIÑOS</a></li>
				<li class="even"><a href="#">OTROS</a></li>
			</ul> 
		<div class="title_box">CARRITO</div>
			<ul class="left_menu">
				<li class="odd"><a href="#">Agregar PRODUCTO</a></li>
				<li class="even"><a href="#">Modificar COMPRA</a></li>
				<li class="odd"><a href="#">Eliminar PRODUCTO</a></li>
			</ul> 
        <div class="title_box">Cerrar Cesion</div> 
	</div>
	<br><br><br><br><br><br><br>
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

  

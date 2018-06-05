<%@page import="domain.model.Dier"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="domain.model.DierSoort"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Voeg een huisdier toe</title>
<link rel="stylesheet" type="text/css" href="style/style.css" />
</head>
<body>
	<div id="container">
		<%@ include file="header.jsp"%>
		<main>
		
<h2>Bevestiging</h2>
<p>Dank je wel om het formulier in te vullen.</p>
<p>Je vulde volgende gegevens in:</p>
<% Dier dier = (Dier) request.getAttribute("dier"); %>
<ul>
<li>Naam: <%= dier.getNaam() %></li>
<li>Soort: <%= dier.getSoort().toString().toLowerCase() %></li>
<li>Aantal keer eten per dag: <%= dier.getVoedsel() %></li>
</ul>
		</main>
		<%@ include file="footer.jsp"%>
	</div>
</body>
</html>
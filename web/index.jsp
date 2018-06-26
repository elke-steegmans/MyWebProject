<%@page import="domain.db.DierDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
	<%! DierDB dierDB = new DierDB(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Mijn huisdieren</title>
<link type="text/css" href="style/style.css" rel="stylesheet" />
</head>
<body>
	<div id="container">
		<%@ include file="header.jsp"%>
		<main>
		<h2>Mijn liefste huisdieren</h2>
		<p>Maak kennis met mijn liefste huisdieren. 
			Ik heb er zo veel ...
			Hoe heten ze, hoeveel
			eten ze, ... Ik noteer het hier allemaal.</p>
			<p>Het meest hongerige dier is <strong id="calculatedValue"><%= dierDB.vindMeestHongeringe().getNaam() %></strong>.</p>
		<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quia
			culpa esse. Delectus nemo similique reiciendis provident quas sunt
			fuga numquam neque quibusdam eum libero eius sit nam asperiores sequi
			voluptatum!</p>

		</main>
		<%@ include file="footer.jsp"%>
	</div>
</body>
</html>

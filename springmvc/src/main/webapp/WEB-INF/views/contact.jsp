<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>

	<div class="container mt-5">

		<h3 class="text-center">${Header}</h3>
		<p class="text-center">${Desc}</p>
		<form action="processForm" method="post">

			<div class="form-group">
				<label for="exampleInputEmail1">Email address</label> 
				<input
					type="email" 
					class="form-control" 
					id="exampleInputEmail1"
					aria-describedby="emailHelp" 
					placeholder="Enter email"
					name="email">
			</div>


			<div class="form-group">
				<label for="userName">Username</label> 
				<input 
					type="text"
					class="form-control" 
					id="exampleInputEmail1"
					aria-describedby="emailHelp" 
					placeholder="Enter here"
					name= "userName">
			</div>

			<div class="form-group">
				<label for="userPassword">User Password</label> 
				<input 
					type="password" 
					class="form-control" 
					id="exampleInputEmail1"
					aria-describedby="emailHelp" 
					placeholder="Enter Password"
					name="password">
			</div>

			<div class="container text-center mt-5">
				<button type="submit" class="btn btn-success">Sign up</button>
			</div>
		</form>
	</div>
	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-eMNCOe7tC1doHpGoWe/6oMVemdAVTMs2xqW4mwXrXsW0L84Iytr2wi5v2QjrP/xp" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.min.js" integrity="sha384-cn7l7gDp0eyniUwwAZgrzD06kc/tftFf19TOAs2zVinnD/C7E91j9yyk5//jjpt/" crossorigin="anonymous"></script>
    -->
</body>
</html>
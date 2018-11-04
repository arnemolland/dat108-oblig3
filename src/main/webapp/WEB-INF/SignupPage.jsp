<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Fra https://purecss.io/ -->
<link rel="stylesheet"
	href="https://unpkg.com/purecss@1.0.0/build/pure-min.css">
<title>Påmelding</title>
</head>
<body>
	<h2>Påmelding</h2>
	<form action="signup" method="post" class="pure-form pure-form-aligned">
		<fieldset>
			<div class="pure-control-group">
				<label for="firstname">Fornavn:</label> <input type="text"
					name="firstname" value="" /> 
					<font color="red">Ugyldig fornavn</font>
			</div>
			<div class="pure-control-group">
				<label for="lastname">Etternavn:</label> <input type="text"
					name="lastname" value="" /> 
					<font color="red">Ugyldig etternavn</font>
			</div>
			<div class="pure-control-group">
				<label for="phone">Mobil (8 siffer):</label> <input type="text"
					name="phone" value="" /> 
					<font color="red">Ugyldig mobil</font>
			</div>
			<div class="pure-control-group">
				<label for="password">Passord:</label> <input type="password"
					name="password" value="" /> 
					<font color="red">Ugyldig passord</font>
			</div>
			<div class="pure-control-group">
				<label for="passwordconf">Passord repetert:</label> <input
					type="password" name="passwordconf"
					value="" /> 
					<font color="red">Passordene må være like</font>
			</div>
			<div class="pure-control-group">
				<label for="gender">Kjønn:</label>
				<input type="radio" name="gender" value="male"/>mann
				<input type="radio" name="gender" value="female"/>kvinne
				<font color="red">Du må oppgi kjønn</font>
			</div>
			<div class="pure-controls">
				<button type="submit" class="pure-button pure-button-primary">Meld
					meg på</button>
			</div>
		</fieldset>
	</form>

	<a href="login">Jeg har allerede en bruker</a> 

	<script src="js/validation.js"></script>
</body>
</html>

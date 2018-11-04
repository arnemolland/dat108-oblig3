<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">

	<link rel="stylesheet" href="css/main.css">

	<!-- Fra https://purecss.io/ -->
	<link rel="stylesheet" href="https://unpkg.com/purecss@1.0.0/build/pure-min.css">
	<title>Påmelding</title>
</head>

<body>
	<h2>Påmelding</h2>
	<form action="signup" method="post" class="pure-form pure-form-aligned">
		<fieldset>
			<div class="pure-control-group">
				<label for="firstname">Fornavn:</label>
				<input id="firstname-input" type="text" name="firstname" value="" />
				<span class="validation-error" id="firstname-error">Ugyldig fornavn</span>
			</div>
			<div class="pure-control-group">
				<label for="lastname">Etternavn:</label>
				<input id="lastname-input" type="text" name="lastname" value="" />
				<span class="validation-error" id="lastname-error">Ugyldig etternavn</span>
			</div>
			<div class="pure-control-group">
				<label for="phone">Mobil (8 siffer):</label>
				<input id="phone-input" type="text" name="phone" value="" />
				<span class="validation-error" id="phone-error">Ugyldig mobil</span>
			</div>
			<div class="pure-control-group">
				<label for="password">Passord:</label>
				<input id="password-input" type="password" name="password" value="" />
				<span class="validation-error" id="password-error">Ugyldig passord</span>
			</div>
			<div class="pure-control-group">
				<label for="passwordconf">Passord repetert:</label>
				<input id="passwordconf-input"type="password" name="passwordconf" value="" />
				<span class="validation-error" id="passwordconf-error">Passordene må være like</span>
			</div>
			<div class="pure-control-group">
				<label for="gender">Kjønn:</label>
				<input type="radio" name="gender" value="male" checked/> mann
				<input type="radio" name="gender" value="female" /> kvinne
			</div>
			<div class="pure-controls">
				<button id="submit-button" type="submit" class="pure-button pure-button-primary">Meld
					meg på</button>
			</div>
		</fieldset>
	</form>

	<a href="login">Jeg har allerede en bruker</a>

	<script src="js/validation.js"></script>
</body>

</html>

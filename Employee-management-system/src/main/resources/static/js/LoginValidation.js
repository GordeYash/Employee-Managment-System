/**
 * Login Validation 
 */

function Emailvalidation() {
	const email = document.getElementById("exampleInputPassword1").value;
	const emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
	if (emailPattern.test(email))
		document.getElementById("validmail").innerHTML = "valid mail";
	else if (email === "")
		document.getElementById("validmail").innerHTML = "";

	else
		document.getElementById("validmail").innerHTML = "email is not valid";

}

function PasswordValidation() {
	const pass = document.getElementById("exampleInputPassword2").value;
	if (pass.length < 6)
		document.getElementById("passvalid").innerHTML = "Password length be 7";
	else if (pass === "")
		document.getElementById("passvalid").innerHTML = "";

	else
		document.getElementById("passvalid").innerHTML = "Password is Strong";

}
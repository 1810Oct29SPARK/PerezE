/**
 * 
 */
let user = {};

window.onload = function() {
	populateUser();
}

function populateUser() {
	//send a GET request to localhost:7001/SessionMgntDemo/session
	fetch("http://localhost:7001/Project1/session").then(function(response) {
		return response.json();
	}).then(function(data) {
		//check whether there was a valid session returned
		//define behavior for no user returned
		if (data.session === null) {
			console.log("data.session was null")
			window.location = "http://localhost:7001/Project1/login";
		} else {
			//define behavior for user returned
			user = data;
			document.getElementById("id").innerText = "Employee Level: "+user.employeeId;
			document.getElementById("firstname").innerText = "First name: "+user.firstName;
			document.getElementById("lastname").innerText = "Last name: "+user.lastName;
			document.getElementById("email").innerText = "Email: "+user.email;
		}
	});
}
/**
 * 
 */
let emps = {};

window.onload = function() {
	populateEmps();
}

function populateEmps() {
	//send a GET request to localhost:7001/SessionMgntDemo/session
	fetch("http://localhost:7001/Project1/employeeList").then(function(response) {
		return response.json();
	}).then(function(data) {
		//check whether there was a valid session returned
		//define behavior for no Emps returned
		if (data.session === null) {
			console.log("data.session was null")
			window.location = "http://localhost:7001/Project1/login";
		} else {
			//define behavior for Emps returned
			var listEmps = "";
			emps = data;
			var i;
			for (i = 0; i < emps.length; i++) { 
			  listEmps += emps[i] + "<br>";
			}
			document.getElementById("list").innerHTML = listEmps;
		}
	});
}
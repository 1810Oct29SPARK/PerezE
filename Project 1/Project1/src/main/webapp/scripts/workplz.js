/**
 * 
 */
let user = {};

window.onload = function() {
	populateUser();
	populateEmps();
	populateReim();
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
			document.getElementById("firstname").innerText = "First name: "+user.firstName;
			document.getElementById("lastname").innerText = "Last name: "+user.lastName;
			document.getElementById("email").innerText = "Email: "+user.email;
		}
	});
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
			fetch("http://localhost:7001/Project1/session").then(function(response) {
				return response.json();
			}).then(function(data) {
				beans = data;
			for (i = 0; i < emps.length; i++) { 
				if (beans.employeeTypeId > emps[i].employeeTypeId) {
					document.getElementById("list").innerHTML = listEmps;
					listEmps += JSON.stringify(emps[i]) + "<br>";
				}
			}
			})
		}
	});
}

function populateReim() {
	//send a GET request to localhost:7001/SessionMgntDemo/session
	fetch("http://localhost:7001/Project1/reimList").then(function(response) {
		return response.json();
	}).then(function(data) {
		//check whether there was a valid session returned
		//define behavior for no Emps returned
		if (data.session === null) {
			console.log("data.session was null")
			window.location = "http://localhost:7001/Project1/login";
		} else {
			//define behavior for Emps returned
			var listReim = "";
			thing = data;
			var i;
			for (i = 0; i < thing.length; i++) { 
				listReim += JSON.stringify(thing[i]);
				var para = document.createElement('p');
				var t = document.createTextNode(listReim);
				para.appendChild(t);
			}
			document.getElementById("reim").appendChild(para);
		}
	});
}
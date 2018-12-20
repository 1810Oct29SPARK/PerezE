package project1.service;

import project1.model.Credentials;
import project1.model.User;

public class AuthenticationService {

	public AuthenticationService() {
	}
	
	public User isValidUser(Credentials credentials) {
		User u = null;
		String username = credentials.getUsername();
		String password = credentials.getPassword();
		//this is AUTHENTICATION (does the user exist in the system?)
		//now AUTHORIZATION (what can the user access within the system?) (user roles)
		//take credentials and return the User to which they belong if it exists
		if (username != null && password != null) {
			//for now... this is fake!! 
			if (username.equals("Steve") && password.equals("wizard")) {
				u = new User(5,username,"Merlin","Cat","wizcat@tampa.com");
			}
		}
		System.out.println(u);
		return u;
	}
	

}
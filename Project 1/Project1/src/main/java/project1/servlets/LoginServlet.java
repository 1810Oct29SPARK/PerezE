package project1.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import project1.beans.Employee;
import project1.model.Credentials;
import project1.service.AuthenticationService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	AuthenticationService authService = new AuthenticationService();

	//return Login page for GET request
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("login.html").forward(req, resp);
	}
	
	//handle POST request from form on Login page
	//(or anywhere else)
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("handling request...");
		// checks whether a session exists, otherwise creates a new one. 
		// overloaded version takes a boolean create param, if false it returns 
		// null if no session exists for the current request. 
		HttpSession session = req.getSession(); 
		resp.setContentType("text/html");
		//grab params from request 
		Credentials cred = new Credentials(req.getParameter("username"),req.getParameter("password"));
		//attempt to authenticate the user
		Employee u = authService.isValidUser(cred);
		//set user information as session attributes
		if (u != null) {
			session.setAttribute("userId", u.getEmployeeId());
			session.setAttribute("employeeType", u.getEmployeeTypeId());
			session.setAttribute("firstname", u.getFirstName());
			session.setAttribute("lastname", u.getLastName());
			session.setAttribute("email", u.getEmail());
			System.out.println(session.getAttribute("email"));
			switch (u.getEmployeeTypeId()) {
			case 1:
				//redirect user to employee page if authenticated
				resp.sendRedirect("employeePage");
				break;
				
			default:
				//redirect user to manager page if authenticated
				resp.sendRedirect("managerPage");
				break;
			}
		} else {
			session.setAttribute("problem", "invalid credentials");
			//redirect user to login page if authentication fails
			resp.sendRedirect("login");
		}
		
	}


}
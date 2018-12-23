package project1.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project1.model.Reim;
import project1.service.ReimbursementService;

@WebServlet("/submitReim")
public class SubmitReimServlet extends HttpServlet{
	
	ReimbursementService reimb = new ReimbursementService();
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		request.getRequestDispatcher("home.html").include(request, response);
		String id = request.getParameter("id");
		String category = request.getParameter("category");
		String amount = request.getParameter("amount");
		reimb.subReim(Integer.parseInt(id), category, Double.parseDouble(amount));
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

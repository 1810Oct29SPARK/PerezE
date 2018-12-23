package project1.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;

import project1.beans.Employee;
import project1.beans.Reimbursement;
import project1.dao.EmployeeDAO;
import project1.dao.EmployeeDAOEmpl;
import project1.dao.ReimbursementDAO;
import project1.dao.ReimbursementDAOEmpl;

@WebServlet("/reimList")
public class ListReimbursementsServlet extends HttpServlet {
	ReimbursementDAO reim = new ReimbursementDAOEmpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// grab current session, if it exists
		response.setContentType("application/json");
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("email") != null) {
			try {
				List<Reimbursement> reimbursemsnts = reim.listReimbursements((int) session.getAttribute("userId"));
				List<Reimbursement> list = new ArrayList<>();
				int i = 0;
				for (Reimbursement r : reimbursemsnts) {
					//System.out.println(e);
					list.add(r);
				}
				response.getWriter().write((new ObjectMapper()).writeValueAsString(list));
			} catch (Exception e) {
				e.printStackTrace();
				response.getWriter().write("{\"listEmployee\":null}");
			}
		} else {
			response.getWriter().write("{\"listEmployee\":null}");
		}
	}

}

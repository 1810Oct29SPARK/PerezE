package project1.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import project1.dao.ReimbursementDAO;
import project1.dao.ReimbursementDAOEmpl;

public class ReimbursementService {
	
	ReimbursementDAO reim = new ReimbursementDAOEmpl();
	
	public void subReim(int emplId, String category, Double amount) {
	    Date dt = new Date();
	    String strDateFormat = "hh:mm:ss a";
	    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
	    String formattedDate= dateFormat.format(dt);
		int id = emplId;
		String cat = category;
		Double amnt = amount;
		String status = "pending";
		String approved = "nobody";
		String dateSub = formattedDate;
		reim.addReimbursement(id, cat, amnt, status, approved, dateSub);
	}

}

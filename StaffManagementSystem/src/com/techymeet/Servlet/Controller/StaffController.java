package com.techymeet.Servlet.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techymeet.Servlet.Bo.Staff;
import com.techymeet.Servlet.Service.StaffService;
import com.techymeet.Servlet.Service.StaffServiceImpl;

/**
 * Servlet implementation class Staff
 */
@WebServlet("/staff")
public class StaffController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       StaffService Service=new StaffServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher Rd=request.getRequestDispatcher("Staff.jsp");
		Rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("Text/Html");
		Staff Bo=new Staff();
		
		String firstNamee = request.getParameter("FirstName");
		Bo.setFirstName(firstNamee);

		String lastName = request.getParameter("LastName");  // Assuming this should be "LastName"
		Bo.setLastName(lastName);

		String address = request.getParameter("Address");
		Bo.setAddress(address);
		
		String location = request.getParameter("Location");
		Bo.setLocation(location);

		String phoneNumberStr = request.getParameter("PhoneNumber");
		Long phoneNumber = null;
		if (phoneNumberStr != null && !phoneNumberStr.isEmpty()) {
		    try {
		        phoneNumber = Long.parseLong(phoneNumberStr);
		    } catch (NumberFormatException e) {
		        // Handle the exception, e.g., log an error, set a default value, etc.
		        System.out.println("Invalid phone number format");
		    }
		}
		Bo.setPhoneNumber(phoneNumber);

		String state = request.getParameter("State");
		Bo.setState(state);
		int Status =Service.CreateStaff(Bo);
		if(0<Status) {
			RequestDispatcher rd=request.getRequestDispatcher("/list");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
			rd.forward(request, response);
		}

		
	}

}
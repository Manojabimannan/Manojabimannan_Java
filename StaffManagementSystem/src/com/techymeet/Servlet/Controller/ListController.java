package com.techymeet.Servlet.Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techymeet.Servlet.Bo.Staff;
import com.techymeet.Servlet.Service.StaffService;
import com.techymeet.Servlet.Service.StaffServiceImpl;

/**
 * Servlet implementation class ListController
 */
@WebServlet("/list")
public class ListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StaffService Service = new StaffServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("Html/Text");
		HttpSession session=request.getSession();
		if(null!=session.getAttribute("LoggedInUser")) {
			ArrayList<Staff> List =Service.StaffList();
			if(null!=List&& 0<List.size()) {
				request.setAttribute("List", List);
				RequestDispatcher rd=request.getRequestDispatcher("List.jsp");
				rd.forward(request, response);
			}else {
				session.setAttribute("ErrorMessage", "No Record Found!");
				RequestDispatcher rd=request.getRequestDispatcher(" ");
				rd.forward(request, response);
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

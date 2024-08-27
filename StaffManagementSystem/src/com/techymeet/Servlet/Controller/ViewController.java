package com.techymeet.Servlet.Controller;

import java.io.IOException;

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
 * Servlet implementation class ViewController
 */
@WebServlet("/view")
public class ViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StaffService Service = new StaffServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("Html/Text");
		HttpSession session = request.getSession();
		if (null != session.getAttribute("LoggedInUser")) {
			int StaffId = Integer.parseInt(request.getParameter("StaffId"));
			Staff Bo = Service.ViewStaff(StaffId);

			session.setAttribute("Bo", Bo);
			RequestDispatcher dispatch = request.getRequestDispatcher("view.jsp");
			dispatch.forward(request, response);
		} else {
			RequestDispatcher dispatch = request.getRequestDispatcher("");
			dispatch.forward(request, response);
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

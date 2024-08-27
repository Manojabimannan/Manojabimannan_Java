package com.techymeet.Servlet.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techymeet.Servlet.Bo.Login;
import com.techymeet.Servlet.Service.LoginService;
import com.techymeet.Servlet.Service.LoginServiceImpl;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       LoginService loginService=new LoginServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher RD=request.getRequestDispatcher("Login.jsp");
		RD.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession Session=request.getSession();
		String userName=request.getParameter("userName");
		String passWord=request.getParameter("passWord");
		Login login=loginService.loginValidate(userName,passWord);
		if(0<login.getLoginId()&& null!=login) {
			Session.setAttribute("LoggedInUser", login.getUserName());
			
			RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);	
		}
	}

}

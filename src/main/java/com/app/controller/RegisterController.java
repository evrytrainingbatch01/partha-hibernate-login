package com.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.DaoImpl;
import com.app.dao.IDao;
import com.app.domain.User;

public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	    public RegisterController() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("userRegistration.jsp");
	}


	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String msg = "Password and Conform Passwords must be same";
		String page = "userRegistration.jsp";
		if (request.getParameter("password").equals(request.getParameter("confPassword"))) {
			User user = new User();
			user.setuName(request.getParameter("username"));
			user.setPwd(request.getParameter("password"));
			user.setuId(request.getParameter("firstName"));
			
			System.out.println(user.toString());
			IDao baseDao = new DaoImpl();
			msg = baseDao.registration(user);
			page = "login.jsp";
		}
		request.setAttribute("msg2", msg);
		request.getRequestDispatcher(page).include(request, response);
	}

}

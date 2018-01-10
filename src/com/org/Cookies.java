package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  response.setContentType("text/html");
  		PrintWriter writer =response.getWriter();
  		String username=request.getParameter("p1");
  		String password=request.getParameter("p2");
  		writer.print("Welcome"+username);
  		writer.println();
  		Cookie cookies=new Cookie("username",username);
  		Cookie cookies1=new Cookie("password",password);
  		response.addCookie(cookies);
  		response.addCookie(cookies1);
  		 writer.print("<br><a href='cookie1'>View Details</a>");
         writer.close();
	}

}
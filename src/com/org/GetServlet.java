package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	private String myMsg;
	
	public void init() throws ServletException {
		myMsg = "My First Servlet";
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>"+myMsg+"</h1>");
		
	}
	
}
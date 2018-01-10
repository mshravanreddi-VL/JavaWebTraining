package com.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class GetCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");

	Cookie c[]=request.getCookies();

	PrintWriter writer=response.getWriter();
	writer.print("Username:"+c[1].getValue());
	writer.print("password:"+c[0].getValue());

	}

}
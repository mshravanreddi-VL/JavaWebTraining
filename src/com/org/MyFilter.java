package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {int Count = 0;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		String testParam = filterConfig.getInitParameter("testParam");

		System.out.println("Test Parameter --> " + testParam);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
			PrintWriter out = response.getWriter();
			String host = request.getRemoteHost();
		   int port = request.getRemotePort();
		
		out.print("Count of visit : "+Count);
		
		
		
		if(Count==0)
		{
		System.out.println("Host === "+host);
		System.out.println("Port == "+port);
		}Count++;
		
		filterChain.doFilter(request, response);
	}

	@Override
	public void destroy() {

	}

}

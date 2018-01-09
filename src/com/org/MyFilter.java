package com.org;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		String testParam = filterConfig.getInitParameter("testParam");

		System.out.println("Test Parameter --> " + testParam);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		String host = request.getRemoteHost();
		int port = request.getRemotePort();
		
		System.out.println("Host === "+host);
		System.out.println("Port == "+port);
		
		filterChain.doFilter(request, response);
	}

	@Override
	public void destroy() {

	}

}

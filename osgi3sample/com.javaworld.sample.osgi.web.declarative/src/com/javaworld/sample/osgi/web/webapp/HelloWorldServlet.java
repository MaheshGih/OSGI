package com.javaworld.sample.osgi.web.webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
<<<<<<< HEAD
		resp.getWriter().println("<h3>Hello from HelloWorldServlet Form declarative </h3>");
=======
		resp.getWriter().println("<h3>Hello from HelloWorldServlet Form declarative Hello</h3>");
>>>>>>> origin/master
	}

}

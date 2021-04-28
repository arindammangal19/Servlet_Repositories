package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet
{	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	{
		try
		{
			PrintWriter out = response.getWriter();
			
			out.println("<h2 style='color:dodgerblue'>Welcome to Servlet Web Page!</h2>");
		}
		
		catch(Exception ee)
		{
			
		}
		
	}

}

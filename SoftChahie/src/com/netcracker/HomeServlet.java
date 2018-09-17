package com.netcracker;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter out=res.getWriter();
		String name=req.getParameter("userName");
		String pass=req.getParameter("password");
		if(pass.length()>5&&name!=null){
					out.println("Welcome" +name);	
		}
	}

}

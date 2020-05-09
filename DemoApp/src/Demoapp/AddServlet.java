package Demoapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class AddServlet extends HttpServlet
{
	 public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	 {
		 int i = Integer.parseInt(req.getParameter("num1"));
		 int j = Integer.parseInt(req.getParameter("num2"));
		 
		 int k = i+j;
		  
		  req.setAttribute("k", k);
		 //2 Methods to call servlet from another servlet.
		 // 1. Request Dispatcher
		 //2. Redirect
		 
		 /* 1.
		 RequestDispatcher rd = req.getRequestDispatcher("sq");
		 rd.forward(req, res);*/
		  
		  //HttpSession
		  HttpSession session = req.getSession();
		  session.setAttribute("k", k);
		  
		//2.
		res.sendRedirect("sq?k="+k);  //URL Rewriting.
	 }
}

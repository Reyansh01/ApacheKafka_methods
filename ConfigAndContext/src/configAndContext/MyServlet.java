package configAndContext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.*;
/*
 * Servlet Config And Servlet Context. ---> Interfaces.
 */
public class MyServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		out.print("Hello and Welcome \n");
		
		//1.
		//To fetch the value of Name and Language we need to create object of Servlet CONTEXT.
		ServletContext ctx = req.getServletContext(); //object is created automatically by Tomcat, we need to access it directly.
		//or we can only write getServletContext().
		String str = ctx.getInitParameter("Name");
		out.println(str);
		
		out.print("Language you are using is : ");
		ServletContext ctx1 = req.getServletContext();
		String str1 = ctx1.getInitParameter("Language");
		out.println(str1);
		
		//2.
		//Suppose we have multiple servers with multiple names and languages so in that case we use ServletConfig.
		//If we have 10 servlets, we will be having 10 different objects of ServletConfig and 1 of ServletContext.
		ServletConfig cfg = getServletConfig();
		String s = cfg.getInitParameter("Name");
		out.println(s);
		
	}
}
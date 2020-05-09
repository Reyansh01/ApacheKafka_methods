package Cookie;

import java.io.IOException;
import javax.servlet.http.*;

public class AddServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		//Cookie :-
		Cookie cookie = new Cookie("k",k+"");  //because the number should be passed in the form of strings.
		res.addCookie(cookie);
		
		res.sendRedirect("sq");  //Redirect this value to sq and with the help of web.xml this sq will be directly given to SqServlet.
		
	}
}

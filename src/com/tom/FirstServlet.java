package com.tom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/f")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doGet(req, resp);
		PrintWriter out = resp.getWriter();
		String s = req.getParameter("n");
		if (s != null) {
			int n = Integer.parseInt(s);
			System.out.println(n);

			out.println("<html>");
			out.println("<body>");
			out.println("Hello");
			for (int i = 1; i <= n; i++) {
				out.println(i + "</br>");
			}
			out.println("</body>");
			out.println("</html>");
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}

}

package com.tom;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistServlet
 */
@WebServlet("/reg")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		String password2 = request.getParameter("password2");
		String email = request.getParameter("email");
		boolean errorUserid = false;
		boolean errorPassword = false;
		boolean errorPasswordNotMatch = false;
		boolean errorEmail = false;
		
		if (userid.length()<4 || userid.length()>20){
			errorUserid = true;
		}
		if (password.length()<6 || password.length()>20){
			errorPassword = true;
		}
		if (!password.equals(password2)){
			errorPasswordNotMatch = true;
			password2 = "";
		}
		if (email.indexOf("@")==-1){
			errorEmail = true;
		}
		if (errorUserid || errorPassword || errorPasswordNotMatch || errorEmail){
			if (errorUserid){
				request.getSession().setAttribute("errorMessageUserid", "帳號長度錯誤(4-20)");
			}
			if (errorPassword){
				request.getSession().setAttribute("errorMessagePassword", "密碼長度錯誤(6-20)");
			}
			if (errorPasswordNotMatch){
				request.getSession().setAttribute("errorMessagePasswordNotMatch", "兩組密碼不相同");
			}
			if (errorEmail){
				request.getSession().setAttribute("errorEmail", "Email格式錯誤");
			}
			request.getSession().setAttribute("userid", userid);
			request.getSession().setAttribute("password", password);
			request.getSession().setAttribute("password2", password2);
			request.getSession().setAttribute("email", email);
			response.sendRedirect("regist.jsp");
		}else{
			response.getWriter().println("註冊成功");
		}
	}

}

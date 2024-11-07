package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IntroSerblet
 */
@WebServlet("/intro-servlet")
public class IntroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>			");
		out.println("<html>						");
		out.println("<meta charset=\"UTF-8\">			");
		out.println("<title>自己紹介だよ</title>			");
		out.println("<link rel=\"stylesheet\" href=\"style.css\">		");
		out.println("</head>			");
		out.println("<body>			");
		out.println("	<h1>自己紹介</h1>			");
		out.println("	<p>こんにちは、古賀稜太郎です。</p>		");
		out.println("	<p>今年はJava頑張ります。</p>		");
		out.println("</body>			");
		out.println("</html>			");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

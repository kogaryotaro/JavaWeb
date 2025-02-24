package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InputSkillServlet
 */
@WebServlet("/input-skill-servlet")
public class InputSkillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		String nameStr = "【名前】　" + request.getParameter("name");
		String[] langArray = request.getParameterValues("lang");
		String langStr = "【言語】　";
		if (langArray != null) {
			for (String lang : langArray) {
				langStr += (lang + "  ");				
			}
		}else {
			langStr += "(未選択)";
		}
		String careerStr = "【経験年数】  " + request.getParameter("career");
		
		request.setAttribute("name", nameStr);
		request.setAttribute("lang", langStr);
		request.setAttribute("career", careerStr);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("output-servlet");
		dispatcher.forward(request, response);
	}

}

package control;

import java.io.IOException;
import java.io.PrintWriter;

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
		String careerStr = "【経験年数】  " + request.getParameter("career");
		
		String langStr = "【言語】　";
		if (langArray != null) {
			for (String lang : langArray) {
				langStr += (lang + "  ");
			}
		}else {
			langStr += "(未選択)";
		}
		
		response.setContentType("text/html: charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>入力確認</title>");
		out.println("<link rel=\"stylesheet\" href=\"style.css\">");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>内容確認</h1>");
		out.println(""+ nameStr + "<br><br>");
		out.println(""+ langStr + "<br><br>");
		out.println(""+ careerStr + "<br><br>");
		out.println(""+ nameStr + "<br><br>");
		out.println("</body>");
		out.println("</html>");
	}

}

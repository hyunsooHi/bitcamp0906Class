package member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userid = request.getParameter("userid");
		String pw = request.getParameter("pw");
		String rpw = request.getParameter("rpw");
		String username = request.getParameter("username");
		
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("	<head><title>파라미터 데이터 받기</title></head>");
		out.println("	<body>");
		out.println("		<h1>");
		out.println("			User ID : " + userid + "<br>");
		out.println("		<h1>");
		out.println("			Password : " + pw);
		out.println("		</h1>");
		out.println("		<h1>");
		out.println("			Name : " + username);
		out.println("		</h1>");
		
		out.println("	</body>");
		out.println("</html>");
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

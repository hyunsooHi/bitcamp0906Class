package member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 오노테이션
//http://localhost:8080/FirstWeb/LoginServlet
//http://localhost:8080/FirstWeb/Login
@WebServlet({ "/LoginServlet", "/Login" })
public class LoginServlet extends HttpServlet {

	// 사용자가 요청할때 get방식으로 요청했을때 처리되는 메소드
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// response.getWriter().append("Served at: ").append(request.getContextPath());

		// request : 사용자의 요청 데이터처리
		// response : 사용자에게 응답할 데이터처리

		// 사용자가 입력한 userid pw를 받아서 응답메세지에 포함해서 처리
		String uid = request.getParameter("userid");
		String pw = request.getParameter("pw");
		System.out.println("userid : " + uid );
		System.out.println("pw : " + pw );
		

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("	<head><title>파라미터 데이터 받기</title></head>");
		out.println("	<body>");
		out.println("		<h1>");
		out.println("			userid : " + uid + "<br>");
		out.println("			pw : " + pw);
		out.println("		</h1>");
		out.println("	</body>");
		out.println("</html>");

	}

	// 사용자가 요청할때 post방식으로 요청했을때 처리되는 메소드
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("포스트방식으로 요청처리!!!");
		doGet(request, response);

	}

}

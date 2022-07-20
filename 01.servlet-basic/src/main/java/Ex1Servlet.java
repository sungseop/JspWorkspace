

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex1Servlet
 */
@WebServlet("/Ex1Servlet")
public class Ex1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String juminno = request.getParameter("juminno1") + "-" + request.getParameter("juminno2");
		String id = request.getParameter("id");
		String psw1 = request.getParameter("psw1");
		String psw2 = request.getParameter("psw2");
		String email = request.getParameter("email_id") + "@" + request.getParameter("email_domain");
		String zip = request.getParameter("zip");
		String address = request.getParameter("address1") + " " + request.getParameter("address2");
		String job = request.getParameter("job");
		String[] interest = request.getParameterValues("item");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("이름: <b>" + name + "</b><br>");
		out.print("주민번호: <b>" + juminno + "</b><br>");
		out.print("아이디: <b>" + id + "</b><br>");
		out.print("비밀번호: <b>" + psw1 + "</b><br>");
		out.print("이메일: <b>" + email + "</b><br>");
		out.print("우편번호: <b>" + zip + "</b><br>");
		out.print("주소: <b>" + address + "</b><br>");
		out.print("직업: <b>" + job + "</b><br>");
		out.print("관심분야: <b>");
			if (interest == null) {
				out.print("선택한 항목이 없습니다.");
			} else {
				for(String item : interest) {
					out.print(item + " ");
				}
			}
		out.print("</b></body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

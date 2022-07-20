package com.ezen.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ezen.dao.EmployeesDAO;
import com.ezen.dto.EmployeesVO;

public class LoginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String lev = request.getParameter("lev");
		String url=null;
		
		EmployeesDAO empDAO = EmployeesDAO.getInstance();
		int result = empDAO.userCheck(id, pwd, lev);
		//
		if(result == 2 || result == 3){
			EmployeesVO emp = new EmployeesVO();
			emp = empDAO.getMember(id);
			
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", emp);			
			session.setAttribute("result", result);			
			url = "main.jsp";				
		}else{
			url = "login.jsp";
			if(result == 1){
				request.setAttribute("message", "사용자 레벨을 확이하여 주십시오.");
			}else if(result == 0){			
				request.setAttribute("message", "비밀번호가 맞지 않습니다.");
			}else{			
				request.setAttribute("message", "아이디가 맞지 않습니다.");
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

}

package com.ezen.controller.action;

public class ActionFactory {

	private ActionFactory() { }
	
	private static ActionFactory instance = new ActionFactory();
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory: " + command);
		
		if(command.equals("login_form")) {
			action = new LoginFormAction();
		} else if(command.equals("login")) {
			action = new LoginAction();
		} else if(command.equals("mypage_form")) {
			action = new MyPageFormAction();
		} else if(command.equals("mypage")) {
			action = new MypageAction();
		} else if(command.equals("join_form")) {
			action = new JoinFormAction();
		} else if(command.equals("join")) {
			action = new JoinAction();
		} else if(command.equals("emp_update")) {
			action = new EmpUpdateAction();
		} else if(command.equals("logout")) {
			action = new LogoutAction();
		}
		
		return action;
	}
}

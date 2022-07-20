package com.ezen.controller;

import com.ezen.controller.action.BookingConfirmAction;
import com.ezen.controller.action.BookingFormAction;
import com.ezen.controller.action.BookingListAction;
import com.ezen.controller.action.BookingWriteAction;
import com.ezen.controller.action.IndexAction;
import com.ezen.controller.action.Action;

public class ActionFactory {
	private ActionFactory() { }
	
	private static ActionFactory instance = new ActionFactory();
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		
		if (command.equals("index")) {
			action = new IndexAction();
		} else if (command.equals("booking_form")) { // 예약화면 출력
			action = new BookingFormAction();
		} else if (command.equals("booking_confirm")) {
			action = new BookingConfirmAction();
		} else if (command.equals("booking_write")) {
			action = new BookingWriteAction();
		} else if (command.equals("booking_list")) {
			action = new BookingListAction();
		}
		
		return action;		
	}
}

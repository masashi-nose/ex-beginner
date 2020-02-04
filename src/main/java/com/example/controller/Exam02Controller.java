package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

	@Autowired
	private HttpSession session;

	@RequestMapping("")
	public String index() {
		return "exam02";

	}

	@RequestMapping("/calc")
	public String calc(int num1, int num2) {
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		
		int ansAdd = num1 + num2;
		session.setAttribute("ansAdd", ansAdd);
		
		return "exam02-result";
	}
	
	@RequestMapping("/to-result2")
	public String toReslt2() {
		return "exam02-result2";
	}
}

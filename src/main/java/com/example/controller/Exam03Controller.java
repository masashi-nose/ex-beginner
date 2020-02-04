package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {

	@Autowired
	private ServletContext application;

	@RequestMapping("")
	public String index() {
		return "exam03";

	}

	@RequestMapping("/receive-info")
	public String receiveInfo(String itemPrice1, String itemPrice2, String itemPrice3) {
		int num1 = Integer.parseInt(itemPrice1);
		int num2 = Integer.parseInt(itemPrice2);
		int num3 = Integer.parseInt(itemPrice3);

		int excludeTaxPrice = num1 + num2 + num3;
		int includeTaxPrice = (int) ((num1 + num2 + num3) * 1.1);

		application.setAttribute("excludeTaxPrice", excludeTaxPrice);
		application.setAttribute("includeTaxPrice", includeTaxPrice);

		return "exam03-result";

	}
}

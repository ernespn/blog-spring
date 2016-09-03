package com.redsol.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value="/greeting")
	public String sayHello (Model model){
		
		Date now = new Date();
		model.addAttribute("greeting", "Hello World");
		model.addAttribute("time", now.toString());

		
		return "hello";
	}
}

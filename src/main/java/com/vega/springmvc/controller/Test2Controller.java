package com.vega.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test2Controller {
	@RequestMapping("/greeting")
	public String hello(Model model) {
		model.addAttribute("greeting", "TestSpring");
		return "index";
	}
	
}

package com.mt.lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Lab2Controller {

	@RequestMapping("/")
	public String home(Model model) {
        String message = "Welcome to COMP367";
        model.addAttribute("message", message);
        return "index";
	}
}

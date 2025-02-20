package com.mt.lab2.controller;

import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Lab2Controller {

	@RequestMapping("/")
	public String home(Model model) {
        LocalTime now = LocalTime.now();
        String message;

        // Get hour of the day (24-hour format)	
        int hour = now.getHour();

        // Set the message based on the time of day
        if (hour >= 5 && hour < 12) {
            message = "Good Morning, Manuel, Welcome to COMP367";
        } else if (hour >= 12 && hour < 17) {
            message = "Good Afternoon, Manuel, Welcome to COMP367";
        } else if (hour >= 17 && hour < 21) {
            message = "Good Evening, Manuel, Welcome to COMP367";
        } else {
            message = "Good Night, Manuel, Welcome to COMP367";
        }

        // Add the message to the model
        model.addAttribute("message", message);
        return "index";
    }
}

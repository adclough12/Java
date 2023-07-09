package com.dojo.daikichiRoutes;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/daikichi")
public class DaikichiController {
	@RequestMapping("")
	public String daikichi() {
		return "Welcome!";
	}
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	@RequestMapping("/travel/{city}")
	public String travelLocation(@PathVariable("city") String city) {
		return "Congratulations! You will soon travel to " + city;
	}
	@RequestMapping("/lotto/{number}")
	public String lotto(@PathVariable("number") int number) {
		if(number % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}
@GetMapping("/omikuji")
public String index() {
	return "index.jsp";
	}
@GetMapping("/omikuji/show")
public String show() {
	return 
}
}

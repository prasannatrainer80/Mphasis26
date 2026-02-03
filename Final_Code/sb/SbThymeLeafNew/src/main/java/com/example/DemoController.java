package com.example;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
	
	@GetMapping(value="/calcresult")
	public String calcresult(@RequestParam int firstNo, 
				@RequestParam int secondNo,
			Model model) {
		int sum = firstNo + secondNo;
		int sub = firstNo - secondNo;
		int mult = firstNo * secondNo;
		model.addAttribute("sum", sum);
		model.addAttribute("sub", sub);
		model.addAttribute("mult", mult);
		return "calcresult";
	}
	
	@GetMapping(value="/calcform")
	public String calcform() {
		return "calcform";
	}
	
	@GetMapping(value="/helloinput")
	public String helloinput() {
		return "helloinput";
	}
	
	@GetMapping(value="/greeting")
	public String greeting(@RequestParam String name, Model model) {
		int hr = new Date().getHours();
		String msg = "";
		if (hr < 12) {
			msg+="Good Morning..." +name+ "!";
		} else {
			msg+="Good Afternoon..." +name+ "!";
		}
		model.addAttribute("message", msg);
		return "greeting";
	}
	
	@GetMapping(value="/")
	public String hello() {
		return "hello";
	}
}

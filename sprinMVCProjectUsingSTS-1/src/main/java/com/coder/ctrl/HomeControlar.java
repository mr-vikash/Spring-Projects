package com.coder.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControlar {
	
	@RequestMapping("/")
	public String handle()
	{
		return "home";
	}

}

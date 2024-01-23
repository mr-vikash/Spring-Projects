package com.coder.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeCtrl {
	
	@RequestMapping("/test")
	@ResponseBody
	public String handle()
	{
		int a = 60 , b = 40, c=10;
		return "The sum of a+b+c = "+(a+b+c);
	}

}

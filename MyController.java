package com.shiven.FirstWebSBProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

		System.out.println("This is Class MyController ****");
	@RequestMapping("index")
	@ResponseBody
	public String  callIndexjsp() {
		
		System.out.println("This is callIndexjsp method ****");
		return "index.jsp";
	}
	
}

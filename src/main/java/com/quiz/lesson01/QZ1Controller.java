package com.quiz.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class QZ1Controller {
   
	@RequestMapping("/jspQZ01/qz01/1")
	public String view() { 
		return "jspQZ01/qz01";
	}
	
}

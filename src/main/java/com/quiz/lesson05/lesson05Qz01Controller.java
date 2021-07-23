package com.quiz.lesson05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class lesson05Qz01Controller {

	@RequestMapping("lesson05/qz01")
	public String ex01() {
		return "lesson05/qz01";
	}
}

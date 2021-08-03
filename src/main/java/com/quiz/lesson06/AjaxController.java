package com.quiz.lesson06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson06/qz01")
@Controller
public class AjaxController {
	@RequestMapping("/favorite_site")
   public String qz01() {
	   
	   return "lesson06/favorite_site";
   }
}

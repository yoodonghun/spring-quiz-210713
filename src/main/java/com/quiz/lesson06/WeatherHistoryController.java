package com.quiz.lesson06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.lesson06.bo.WeatherHistoryBO;

@Controller
public class WeatherHistoryController {
	@Autowired
	   private WeatherHistoryBO weatherHistoryBO;
   @RequestMapping("/lesson06/qz01")
   
   public String qz01(Model model) {
	   
	  model.addAttribute("WeatherHistory", WeatherHistory);  
	  
	   
	   return "lesson06/qz01";
   }
}

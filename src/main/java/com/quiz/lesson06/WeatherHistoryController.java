package com.quiz.lesson06;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quiz.lesson06.bo.WeatherHistoryBO;
import com.quiz.lesson06.model.WeatherHistory;

@Controller
@RequestMapping("/lesson06")
public class WeatherHistoryController {
	@Autowired
	   private WeatherHistoryBO weatherHistoryBO;
	
   @RequestMapping("/weather_history")
    public String qz01(Model model) {
	   
	   List<WeatherHistory> weatherHistoryList = weatherHistoryBO.getWeatherHistoryList();
		model.addAttribute("weatherHistoryList", weatherHistoryList); 
	  
	   
	   return "lesson06/weather_history";
   }
   
   @RequestMapping("/add_weather_view")
	public String addWeatherView() {
		return "lesson06/add_weather";
	}
	
	@PostMapping("add_weather")
	public String addWeather(
			@RequestParam("date") String date, 
			@RequestParam("weather") String weather, 
			@RequestParam("temperatures") double temperatures, 
			@RequestParam("precipitation") double precipitation, 
			@RequestParam("microDust") String microDust, 
			@RequestParam("windSpeed") double windSpeed) {
		
		weatherHistoryBO.addWeatherHistory(date, weather, temperatures, precipitation, microDust, windSpeed);
		return "redirect:/lesson06/weather_history";
}
}	

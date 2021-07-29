package com.quiz.lesson06.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.quiz.lesson06.model.WeatherHistory;

@Repository
public interface WeatherHistoryDAO {
	
	
   public List<WeatherHistory> selectWeatherHistoryList();
   
   public int insertWeatherHistory(
			@Param("date") String date, 
			@Param("weather") String weather, 
			@Param("temperatures") double temperatures, 
			@Param("precipitation") double precipitation, 
			@Param("microDust") String microDust, 
			@Param("windSpeed") double windSpeed);
}

package com.quiz.lesson06.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson06.dao.WeatherHistoryDAO;
import com.quiz.lesson06.model.WeatherHistory;

@Service
public class WeatherHistoryBO {
	@Autowired
	   private WeatherHistoryDAO weatherHistoryDAO;
	//Err :TooManyResultException => 쿼리에서 가져온 데이터는 여러행인데, 받는 쪽에서 단건의 객체로 받으려 한다
   public List<WeatherHistory> getWeatherHistory(){
	   
	   
	   return weatherHistoryDAO.selectWeatherHistoryList();
   }
}

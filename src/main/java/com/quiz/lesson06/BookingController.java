package com.quiz.lesson06;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.lesson06.bo.BookingBO;
import com.quiz.lesson06.model.Booking;

@RequestMapping("/lesson06")
@Controller
public class BookingController {
	@Autowired
	private BookingBO bookingBO;
   
	@RequestMapping("/qz03")
	public String bookingList(Model model) {
		List<Booking> bookingList = bookingBO.getBookingnList();
		model.addAttribute("bookingList", bookingList);
		
		
		return "lesson06/qz03";
	}
	
	
}

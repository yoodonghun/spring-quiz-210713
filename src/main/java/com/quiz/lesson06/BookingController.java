package com.quiz.lesson06;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@ResponseBody //AJAX의 호출이기에 반드시 필요, return 갑도 반드시 필요
	@DeleteMapping("/delete_booking")
	public Map<String, String> deleteBooking(
			@RequestParam("booking_id") int id){
		
		int deletedRowCount = bookingBO.deleteBookingById(id);
		
		
		
		//쿼리로 id에 해당하는 booking 삭제
		Map<String, String> result = new HashMap<>();
		if(deletedRowCount > 0) {
			result.put("result", "success");
		}else {
			result.put("result", "faild");
		}
		
		
		return result;
	}
	
}

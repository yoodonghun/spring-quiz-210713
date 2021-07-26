package com.quiz.lesson04;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.lesson04.model.Realtor;

@Controller
@RequestMapping("/lesson04/qz02")
public class lesson04QZ02Controller {
  
	@RequestMapping("/1")
	public String qz02_1() {
		return "lesson04/addRealtor";
	}
	
	
	@PostMapping("//add_realtor")
		public String addRealtor(
				@ModelAttribute Realtor realtor,
				Model model) {
			
		realtorBO.insertRealtor(realtor);
		Realtor newRealtor = realtorBO.getRealtor(realtor.getId());
		model.addAttribute("realtor", newRealtor);
			
			return "lesson04/afterAddRealtor";
		}
}

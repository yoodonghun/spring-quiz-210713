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
			
			realtorBO.addRealtor(realtor);
			//3. DB select를 해와서 view 페이지에 넣는다
			Realtor newRealtor = realtorBO.getRealtorById(realtor.getId());
			
			return "lesson04/afterAddRealtor";
		}
}

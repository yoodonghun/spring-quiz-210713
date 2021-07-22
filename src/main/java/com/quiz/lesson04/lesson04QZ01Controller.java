package com.quiz.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quiz.lesson04.bo.SellerBO;
import com.quiz.lesson04.model.Seller;

@Controller
@RequestMapping("/lesson04/quiz01")
public class lesson04QZ01Controller {
	@Autowired
	private SellerBO sellerBO;

	//http://localhost/lesson04/quiz01/1
	@RequestMapping("/1")
	public String qz01() { //StringViewResolver
		return "lesson04/addSeller";
		
	}
	//http://localhost/lesson04/quiz01/add_seller
	@RequestMapping("/add_seller")
	public String addSeller(
			@RequestParam("nickname") String nickname,
			@RequestParam("profile_url") String profileImageUrl,
			@RequestParam("temperature") double temperature) {
		
		
		return "lesson04/afterAddSeller";
	}
	
	//http://localhost/lesson04/quiz01/seller_info
	@RequestMapping("/seller_info")
	public String sellerInfo(
            @RequestParam(value="id", required = false) Integer id,            
			Model model) {
		
		Seller seller = null;
		if(id== null) {
			seller = sellerBO.getLatestSeller();
		}else {
			seller = sellerBO.getSellerById(id);
		}
		
		
		model.addAttribute("seller", seller);
		return "lesson04/sellerInfo";
	}
}

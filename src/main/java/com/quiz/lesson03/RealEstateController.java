package com.quiz.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.bo.RealEstateBO;
import com.quiz.lesson03.model.RealEstate;

@RestController
@RequestMapping("/lesson03/qz01")
public class RealEstateController {
	@Autowired
	private RealEstateBO realEstateBO;
	
   @RequestMapping("/1")
   public RealEstate qz01(
		   @RequestParam("id") int id) {
		    
	   return realEstateBO.getRealEstate(id);
   }
   
   @RequestMapping("/2")
   public RealEstate qz02(
		   @RequestParam("area") int area ,
		   @RequestParam("price") int price) {
	   return realEstateBO.getRealEstate(area, price);
   }
   
   @RequestMapping("/3")
   public int qz03() {
	   RealEstate realEstate = new RealEstate();
	   realEstate.setRealtorId(3);
	   realEstate.setAddress("푸르지용 리버 303동 1104호");
	   realEstate.setArea(89);
	   realEstate.setType("매매");
	   realEstate.setPrice(100000);
	   
	   int row = realEstateBO.insertRealEstate(realEstate);
	   
	   return row;
	   
   }
}

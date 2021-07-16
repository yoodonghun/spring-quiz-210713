package com.quiz.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson03.dao.RealEstateDAO;
import com.quiz.lesson03.model.RealEstate;

@Service
public class RealEstateBO {
   @Autowired
   private RealEstateDAO realEstateDAO;
   
   public RealEstate getRealEstate() {
	   return realEstateDAO.selectRealEstate();
   }
}

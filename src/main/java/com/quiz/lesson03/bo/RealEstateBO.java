package com.quiz.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson03.dao.RealEstateDAO;
import com.quiz.lesson03.model.RealEstate;

@Service
public class RealEstateBO {
   @Autowired
   private RealEstateDAO realEstateDAO;
   
   public RealEstate getRealEstate(int id) {
	   return realEstateDAO.selectRealEstate(id);
   }
   
   public RealEstate getRealEstate(int area, int price) {
	   return realEstateDAO.selectRealEstateAreaAndPrice(area, price);
   }
   
   public int insertRealEstate(RealEstate realEstate) {
	   return realEstateDAO.insertRealEstate(realEstate);
   }
   
   public int insertRealEstateAsField(int realtorId, String address, int area, String type,
		   int price, Integer rentPrice) {
	   return realEstateDAO.insertRealEstateAsField(realtorId,address,area,type,price,rentPrice);
   }
   
   public int updateRealEstate(int id, String type, int price) {
	   return realEstateDAO.updateRealEstate(id,type,price);
   }
   
   public int deleteRealEstateById(int id) {
	   return realEstateDAO.deleteRealEstateById(id);
   }
}

package com.quiz.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson04.dao.SellerDAO;
import com.quiz.lesson04.model.Seller;

@Service
public class SellerBO {
  @Autowired
  private SellerDAO sellerDAO;
	
	public void insertSeller(String nickname, String protileImageUrl, double temperature) {
		sellerDAO.insertSeller(nickname, protileImageUrl, temperature);
	}
	
	public Seller getLatestSeller() {
		return sellerDAO.selectLatestSeller();
	}
	
	public Seller getSellerById(int id) {
		return sellerDAO.selectSellerById(id);
	}
}

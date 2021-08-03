package com.quiz.lesson06.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson06.dao.FavoriteSiteDAO;
import com.quiz.lesson06.model.Site;

@Service
public class FavoriteSiteBO {
	@Autowired
	private FavoriteSiteDAO favoriteSiteDAO;
	
   public void getFavoriteSite(String name, String url) {
	   favoriteSiteDAO.insertFavoriteSite(name, url);
   }
   
   public List<Site> getFavoriteSiteList(){
	   return favoriteSiteDAO.selectFavoriteSiteList();
   }
}

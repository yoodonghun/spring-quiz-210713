package com.quiz.lesson06.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.quiz.lesson06.model.Site;

@Repository
public interface FavoriteSiteDAO {
	public int insertFavorite(
			@Param("name") String name, 
			@Param("url") String url);
	
	public List<Site> selectFavoriteList();
}

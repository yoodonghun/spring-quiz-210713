package com.quiz.lesson06;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.quiz.lesson06.bo.FavoriteSiteBO;
import com.quiz.lesson06.model.Site;


@Controller
public class AjaxController {
	@Autowired
	private FavoriteSiteBO favoriteSiteBO;
	
	@RequestMapping("/lesson06/qz01/favorite_site_view")
   public String qz01() {
	   
	   return "lesson06/favorite_site";
   }
	
	@PostMapping("/lesson06/qz01/favorite_site")
	@ResponseBody
	public Map<String, String> getFavoriteList(
		@RequestParam("name") String name,
	   @RequestParam("url") String url) {
	   
	   
		   
	   
	   //DB Insert
		   
		   //성공했는지 여부 리턴
		   //{'result':'success'}
		   Map<String, String> resultMap = new HashMap<>();
		   resultMap.put("result", "success");
		   
		   return resultMap;
	}
	
	@RequestMapping("/lesson06/qz01/favorite_list_view")
	public String favoriteListView(Model model) {
		List<Site> favoriteSite = favoriteSiteBO.getFavoriteSiteList();
		return "lesson06/favorite_list";
	}
}

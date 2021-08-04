package com.quiz.lesson06;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.quiz.lesson06.bo.FavoriteSiteBO;
import com.quiz.lesson06.model.Site;

@RequestMapping("/lesson06")
@Controller
public class AjaxController {
	@Autowired
	private FavoriteSiteBO favoriteSiteBO;
	
		
		// 즐겨찾기 추가하기 뷰 화면
		@RequestMapping("/qz02")
		public String quiz01() {
			return "lesson06/qz02";
		}
		
		@ResponseBody
		@RequestMapping("/qz02/add_favorite")
		public Map<String, String> addFavorite(
				@RequestParam("title") String title,
				@RequestParam("url") String url) {
			
			favoriteSiteBO.addFavorite(title, url);
			
			Map<String, String> result = new HashMap<>();
			result.put("result", "success");
			
			return result;
		}
		
		@RequestMapping("/qz02/favorite_list")
		public String favoriteList(Model model) {
			List<Site> favoriteList = favoriteSiteBO.getFavoriteList();
			
			model.addAttribute("favoriteList", favoriteList);
			return "lesson06/favorite_list";
		}
	   
   }


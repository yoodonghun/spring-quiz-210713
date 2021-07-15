package com.quiz.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson02.bo.StoreBO;
import com.quiz.lesson02.model.Store;

@RestController
public class quiz01RestController {
   
	
	
	   @Autowired
	   private StoreBO storeBO;
	   
		@RequestMapping("/lesson02/qz01")
		public List<Store> qz01(){
			List<Store> result = storeBO.getStoreList();
			return result;
		}
}

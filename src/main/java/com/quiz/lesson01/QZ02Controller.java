package com.quiz.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/qz02")
@RestController
public class QZ02Controller {
   @RequestMapping("/1")
   public List<Map<String, Object>> listMap() {
	   List<Map<String, Object>> result = new ArrayList<>();
	   Map<String, Object> map = new HashMap<>();
	   map.put("rate", 15);
	   map.put("director", "봉준호");
	   map.put("time", 131);
	   map.put("title", "기생충");
	   result.add(map);
	   
	   map = new HashMap<>();
	   map.put("rate", 0);
	   map.put("director", "노베르토 베니니");
	   map.put("time", 116);
	   map.put("title", "인생은 아름다워");
	   result.add(map);
	   
	   map = new HashMap<>();
	   map.put("rate", 12);
	   map.put("director", "크리슽토퍼 놀란");
	   map.put("time", 147);
	   map.put("title", "인셉션");   
	   result.add(map);
	   return result;
	   
	   
	   
	   
   }
   
   @RequestMapping("/2")
   public List<Board> quiz02_2() {
	   List<Board> result = new ArrayList<>();
	   Board board = new Board();
	   board.setTitle("안녕하세요 가입인사 드립니다");
	   board.setUser("hagulu");
	   board.setContent("안녕하세요. 가입했어요. 앞으로도 잘 부탁 드립니다. 활동 열심히 하겠습니다");
	   result.add(board);
	   
	   board = new Board();
	   board.setTitle("헐 대박");
	   board.setUser("winter");
	   board.setContent("오늘 목요일이였어.... 금요일인줄");
	   result.add(board);
	   
	   board = new Board();
	   board.setTitle("오늘 데이트 한 이야기 해드릴게요");
	   board.setUser("dlwldms");
	   board.setContent("......");
	   result.add(board);
	   
	   return result;
   }
   
   @RequestMapping("/3")
   public ResponseEntity<Board> quiz_3() {
	   Board board = new Board();
	   board.setTitle("안녕하세요 가입인사 드립니다");
	   board.setUser("hagulu");
	   board.setContent("안녕하세요. 가입했어요. 앞으로도 잘 부탁 드립니다. 활동 열심히 하겠습니다");
	   
	   return new ResponseEntity<>(board, HttpStatus.INTERNAL_SERVER_ERROR);
   }
   
}

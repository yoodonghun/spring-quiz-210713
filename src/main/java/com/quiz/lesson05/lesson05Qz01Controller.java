package com.quiz.lesson05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.lesson05.model.Member;

@Controller
public class lesson05Qz01Controller {

	@RequestMapping("lesson05/qz01")
	public String qz01() {
		return "lesson05/qz01";
	}
	
	@RequestMapping("lesson05/qz02")
	public String qz02(Model model) {
		List<String> music = new ArrayList<>();
		music.add("강남스타일");
		music.add("벚꽃엔딩");
		music.add("좋은날");
		music.add("거짓말");
		music.add("보고싶다");
		
		model.addAttribute("music", music);
		
		return "lesson05/qz02";
	}
	
	@RequestMapping("lesson05/qz03")
	public String qz03(Model model) {
		List<Map<String, Object>> membership = new ArrayList<>();

		Map<String, Object> member = new HashMap<>();
		member.put("name", "손오공");
		member.put("phoneNumber", "010-1234-5678");
		member.put("grade", "VIP");
		member.put("point", 12040);
		membership.add(member);

		member = new HashMap<>();
		member.put("name", "저팔계");
		member.put("phoneNumber", "010-4321-1234");
		member.put("grade", "BASIC");
		member.put("point", 3420);
		membership.add(member);

		member = new HashMap<>();
		member.put("name", "사오정");
		member.put("phoneNumber", "010-8888-1111");
		member.put("grade", "GOLD");
		member.put("point", 1530);
		membership.add(member);

		member = new HashMap<>();
		member.put("name", "삼장");
		member.put("phoneNumber", "010-0000-1234");
		member.put("grade", "GOLD");
		member.put("point", 8450);
		membership.add(member);

		member = new HashMap<>();
		member.put("name", "우마왕");
		member.put("phoneNumber", "010-1111-2222");
		member.put("grade", "BASIC");
		member.put("point", 420);
		membership.add(member);
		
		model.addAttribute("membership", membership);
		
		return "lesson05/qz03";
	}
	
	@RequestMapping("/lesson05/qz04")
	public String qz04(Model model) {
		
		List<Integer> candidate = new ArrayList<>();
		candidate.add(263001);
		candidate.add(173942); 
		candidate.add(563057); 
		
		model.addAttribute("candidate", candidate);
		model.addAttribute("totalcount", 100000);
		
		return "lesson05/qz04";
	}
	
	@RequestMapping("/lesson05/qz05")
	public String qz05(Model model) {
		List<Map<String, Object>> cardBills = new ArrayList<>();

		Map<String, Object> cardBill = new HashMap<>();
		cardBill.put("store", "GS48");
		cardBill.put("pay", 7800);
		cardBill.put("date", "2025-09-14");
		cardBill.put("installment", "일시불");
		cardBills.add(cardBill);

		cardBill = new HashMap<>();
		cardBill.put("store", "현태백화점");
		cardBill.put("pay", 2750000);
		cardBill.put("date", "2025-09-18");
		cardBill.put("installment", "3개월");
		cardBills.add(cardBill);

		cardBill = new HashMap<>();
		cardBill.put("store", "요촌치킨");
		cardBill.put("pay", 180000);
		cardBill.put("date", "2025-09-20");
		cardBill.put("installment", "일시불");
		cardBills.add(cardBill);
		
		model.addAttribute("cardBills", cardBills);
		
		return "lesson05/qz05";
	}
	
	@RequestMapping("/lesson05/qz06")
	public String qz06(Model model) {

		List<Member> members = new ArrayList<>();

		Member member1 = new Member();
		member1.setName("유비");
		member1.setPhoneNumber("010-1234-5678");
		member1.setEmail("youbee@gmail.com");
		member1.setNationality("삼국시대 촉한");
		member1.setIntroduce("저는 촉의 군주 유비입니다. 삼국통일을 위해 열심히 일하겠습니다.");
		members.add(member1);

		member1 = new Member();
		member1.setName("관우");
		member1.setPhoneNumber("010-1234-5678");
		member1.setEmail("woo@naver.com");
		member1.setNationality("삼국시대 촉한");
		member1.setIntroduce("관우에요. 저는 유비형님 보다 나이는 많지만 일단 아우입니다.");
		members.add(member1);

		member1 = new Member();
		member1.setName("장비");
		member1.setPhoneNumber("02-111-3333");
		member1.setNationality("삼국시대 촉한");
		member1.setEmail("tools@gmail.com");
		member1.setIntroduce("장비라우");
		members.add(member1);

		member1 = new Member();
		member1.setName("조조");
		member1.setPhoneNumber("010-0987-4321");
		member1.setNationality("삼국시대 위");
		member1.setEmail("jojo@gmail.com");
		member1.setIntroduce("이름은 조조 자는 맹덕이라 하오");
		members.add(member1);

		member1 = new Member();
		member1.setName("주유");
		member1.setPhoneNumber("010-0000-1111");
		member1.setNationality("삼국시대 오");
		member1.setEmail("jooyou@kakao.com");
		member1.setIntroduce("주유는 주유소에서 ㅋㅋ");
		members.add(member1);

		member1 = new Member();
		member1.setName("황충");
		member1.setPhoneNumber("031-432-0000");
		member1.setNationality("삼국시대 촉한");
		member1.setEmail("yellowbug@naver.com");
		member1.setIntroduce("내 수염 좀 멋있는 듯");
		members.add(member1);
		
		model.addAttribute("members", members);
		
		
		return "lesson05/qz06";
	}
	
	   
	 
	    
}

package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/index.do")
	public String main(){
		System.out.println("������̼Ǳ�� ��Ʈ�ѷ�");
		return "main/index";
	}

}

package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/index.do")
	public String main(){
		System.out.println("어노테이션기반 컨트롤러");
		return "main/index";
	}

}

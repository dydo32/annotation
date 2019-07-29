package emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import emp.dao.MyEmpDAO;
import emp.dto.EmpDTO;

@Controller
public class SearchController {
	@Autowired
	@Qualifier("empdao")
	MyEmpDAO dao;
	
	//get������� ��û�ɶ� ����� �޼ҵ�
	//	- search�� addr�� �Է��� �� �ִ� �������� response�Ǿ��
	@RequestMapping(value="/search.do",method=RequestMethod.GET)	//method -> get����϶�
	public String showView(){
		return "emp/search";
	}
	
	@RequestMapping(value="/search.do",method=RequestMethod.POST)	//method -> post���
	public ModelAndView search(@RequestParam String addr, String test){	//@RequestParam�� ����ؼ� �޾Ƶ� �ǰ�, name�� ���� String���� �Ű����� �־��
		System.out.println("addr=>"+addr);
		System.out.println("test=>"+test);
		ModelAndView mav = new ModelAndView();
		List<EmpDTO> emplist = dao.findByAddr(addr);
		mav.addObject("emplist", emplist);
		mav.setViewName("emp/emp_list");
		return mav;
	}
	
}

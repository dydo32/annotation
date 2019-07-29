package exam.anno01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("myservice")
public class MyServiceImpl implements MyService {
	String name;
	String msg;
	
	@Autowired
	@Qualifier("logicImpl2")
/*	@Qualifier("logicImpl")*/
	Logic logic;

	public MyServiceImpl(){
		System.out.println("MyServiceImpl�� �⺻������");
	}
	
	public MyServiceImpl(String name, String msg, Logic logic) {
		super();
		this.name = name;
		this.msg = msg;
		this.logic = logic;
		System.out.println("MyServiceImpl�Ű����� �� �� ������");
	}

	@Override
	public void testLogic() {
		System.out.println(msg+","+name);
		logic.testLogic();
	}
}

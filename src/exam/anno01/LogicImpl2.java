package exam.anno01;

import org.springframework.stereotype.Service;

@Service
public class LogicImpl2 implements Logic {
	@Override
	public void testLogic() {
		System.out.println("어노테이션 확인하기");
	}
}

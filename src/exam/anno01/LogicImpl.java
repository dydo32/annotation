package exam.anno01;

import org.springframework.stereotype.Service;

@Service
public class LogicImpl implements Logic {
	@Override
	public void testLogic() {
		System.out.println("db����, xml, json�Ľ�, ������� �����ϴ� �����Ͻ� �޼ҵ�");
	}
}

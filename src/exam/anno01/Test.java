package exam.anno01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("/config/bean.xml");

		/*MyService service = context.getBean("myServiceImpl",MyService.class);*/
		MyService service = context.getBean("myservice",MyService.class);
		service.testLogic();
	}
}

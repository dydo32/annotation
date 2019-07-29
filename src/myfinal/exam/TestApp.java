package myfinal.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/config/bean.xml");
		InterMessage bean = context.getBean("msg", InterMessage.class);
		bean.sayHello();
	}
}

package myfinal.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("msg")
public class MessageBean implements InterMessage {
	private String name;
	private String greeting;
	@Autowired
	//@Qualifier("console")
	@Qualifier("file")
	Outputter Outputter;

	public MessageBean() {}
	
	public MessageBean(String name) {
		super();
		this.name = name;
		System.out.println("MessageBean 한 개 생성자");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
		System.out.println("MessageBean의 setter, greeting");
	}

	public void setOutputter(Outputter outputter) {
		Outputter = outputter;
		System.out.println("MessageBean의 setter, outputter");
	}

	@Override
	public void sayHello() {
		String msg = name+", "+greeting;
		Outputter.output(msg);
	}
	

}

package myfinal.exam;

import org.springframework.stereotype.Service;

@Service("console")
public class ConsoleOutputter implements Outputter {
	private  String filePath;

	public void setFilePath(String filePath){
		
	}
	
	@Override
	public void output(String message) {
		System.out.println("콘솔로 출력하기: " + message);
	}
}

package myfinal.exam;

import org.springframework.stereotype.Service;

@Service("file")
public class FileOutputter implements Outputter {
	private  String filePath;

	public void setFilePath(String filePath){
		
	}
	
	@Override
	public void output(String message) {
		System.out.println("���Ϸ� ����ϱ�: " + message);
	}
}

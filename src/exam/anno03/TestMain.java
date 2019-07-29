package exam.anno03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/config/bean.xml");
		IWriteArticleMgr mgr = context.getBean("mgr",IWriteArticleMgr.class);
		
		ArticleDTO article = new ArticleDTO("��ٿ�", "Ÿ��Ʋ!", "����~~", "18/07/31");
		mgr.write(article);
	}
}
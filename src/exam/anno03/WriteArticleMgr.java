package exam.anno03;
//service�� ������ �ϴ� Ŭ����

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("mgr")
public class WriteArticleMgr implements IWriteArticleMgr {
	
	@Autowired
	//@Qualifier("mysql")
	@Qualifier("oracle")
	IArticleDAO articleDAO;
	
	public WriteArticleMgr(){	//�⺻������ �����α�
		System.out.println("�⺻������");
	}
	public WriteArticleMgr(IArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
	}

	@Override
	public void write(ArticleDTO article) {
		//System.out.println(article.getName()+", "+article.getTitle()+", "+article.getContent()+", "+article.getDate());
		articleDAO.insert(article);
	}
}

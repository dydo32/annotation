package exam.anno03;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository("oracle")
public class OracleArticleDAO implements IArticleDAO {
	@Override
	public void insert(ArticleDTO article) {
		System.out.println("Oracle insert");
	}
}

package step5;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisSelect {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = 
                Resources.getResourceAsStream("step5/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory =
          new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        

        List<Board> records = sqlSession.selectList("JdbcTestMapper.findAll");
        

        for (Board board : records) {
            

            System.out.printf("%d,%s,%s,%d\n",  
                    board.getNo(),
                    board.getTitle(),
                    board.getCreateDate(),
                    board.getViewCount());
        }
        
        sqlSession.close();
    }
}

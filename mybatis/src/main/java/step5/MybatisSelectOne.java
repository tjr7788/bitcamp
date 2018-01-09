package step5;

import java.io.InputStream;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisSelectOne {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = 
                Resources.getResourceAsStream("step5/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory =
          new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        Board board = sqlSession.selectOne("JdbcTestMapper.findByNo", 3);
        
        System.out.printf("%d,%s,%s,%s,%s\n",  
                board.getNo(),
                board.getTitle(),
                board.getContents(),
                board.getCreateDate(),
                board.getViewCount());
        
        sqlSession.close();
    }
}

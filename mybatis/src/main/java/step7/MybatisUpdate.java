package step7;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUpdate {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = 
                Resources.getResourceAsStream("step7/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory =
          new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        Board board = new Board();
        
        board.setTitle("오호라제목");
        board.setContents("내용");
        board.setNo(10);
        
        int count = sqlSession.update("JdbcTestMapper.update", board);
        
        sqlSession.commit();
        
        System.out.printf("%d 개가 수정되었습니다.", count);
        
        sqlSession.close();
    }
}

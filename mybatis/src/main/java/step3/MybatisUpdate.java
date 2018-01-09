package step3;

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
                Resources.getResourceAsStream("step3/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory =
          new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        Map<String,Object> data = new HashMap<>();
        
        data.put("title", "오호라제목");
        data.put("contents", "내용");
        data.put("no", 10);
        
        int count = sqlSession.update("JdbcTestMapper.update", data);
        
        sqlSession.commit();
        
        System.out.printf("%d 개가 수정되었습니다.", count);
        
        sqlSession.close();
    }
}

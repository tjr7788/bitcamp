package step7;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisDelete {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = 
                Resources.getResourceAsStream("step7/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory =
          new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        int count = sqlSession.delete("JdbcTestMapper.delete", 30);
        
        sqlSession.commit();
        
        System.out.printf("%d 개가 삭제되었습니다.", count);
        
        sqlSession.close();
    }
}

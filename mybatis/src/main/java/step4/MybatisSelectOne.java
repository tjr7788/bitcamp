package step4;

import java.io.InputStream;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisSelectOne {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = 
                Resources.getResourceAsStream("step4/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory =
          new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        Map<String, Object> record = sqlSession.selectOne("JdbcTestMapper.findByNo", 3);
        
        System.out.printf("%d,%s,%s,%s,%s\n",  
                    record.get("no"),
                    record.get("title"),
                    record.get("conts"),
                    record.get("regdt"),
                    record.get("vwcnt"));
        
        sqlSession.close();
    }
}

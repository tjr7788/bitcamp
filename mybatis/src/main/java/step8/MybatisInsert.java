package step8;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import step9.BoardDao;
import step9.SqlSessionFactoryBean;

public class MybatisInsert {
    public static void main(String[] args) throws Exception {
        BoardDao boardDao = new BoardDao();
        boardDao.setSqlSessionFactory(SqlSessionFactoryBean.getObject());
        
        
        Board board = new Board();
        
        board.setTitle("오호라제목");
        board.setContents("내용");
        boardDao.insert(board);
        
        
        System.out.printf("%d 개가 입력되었습니다.", count);
        
    }
}

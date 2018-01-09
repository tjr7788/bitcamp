package step9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MybatisSelect {
    public static void main(String[] args) throws Exception {
        BoardDao boardDao = new BoardDao();
        boardDao.setSqlSessionFactory(SqlSessionFactoryBean.getObject());
        
        Map<String,Object> data = new HashMap<>();
        data.put("orderColumn", "title");
        data.put("align", "desc");
        
        List<Board> records = boardDao.findAll(data);

        for (Board board : records) {
            
            System.out.printf("%d,%s,%s,%d\n",  
                    board.getNo(),
                    board.getTitle(),
                    board.getCreateDate(),
                    board.getViewCount());
        }
        
    }
}

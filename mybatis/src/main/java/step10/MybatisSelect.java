package step10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisSelect {
    public static void main(String[] args) throws Exception {
        
        ClassPathXmlApplicationContext iocContainer =
                new ClassPathXmlApplicationContext(
                        "step10/application-context.xml");
        BoardDao boardDao = iocContainer.getBean(BoardDao.class);
        
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
        iocContainer.close();
        
    }
}

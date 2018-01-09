package step10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisSelectOne {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext iocContainer =
                new ClassPathXmlApplicationContext(
                        "step10/application-context.xml");
        BoardDao boardDao = iocContainer.getBean(BoardDao.class);
        Board board = boardDao.findOne();
        System.out.printf("%d,%s,%s,%s,%s\n",  
                board.getNo(),
                board.getTitle(),
                board.getContents(),
                board.getCreateDate(),
                board.getViewCount());
        iocContainer.close();
    }
}

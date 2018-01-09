package step10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisInsert {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext iocContainer =
                new ClassPathXmlApplicationContext(
                        "step10/application-context.xml");
        BoardDao boardDao = iocContainer.getBean(BoardDao.class);
        Board board = new Board();
        
        board.setTitle("오호라제목");
        board.setContents("내용");
        int count = boardDao.insert(board);
        
        System.out.printf("%d 개가 입력되었습니다.", count);
        iocContainer.close();
    }
}

package step9;

public class MybatisSelectOne {
    public static void main(String[] args) throws Exception {
        BoardDao boardDao = new BoardDao();
        boardDao.setSqlSessionFactory(SqlSessionFactoryBean.getObject());
        
        Board board = boardDao.findOne();
        System.out.printf("%d,%s,%s,%s,%s\n",  
                board.getNo(),
                board.getTitle(),
                board.getContents(),
                board.getCreateDate(),
                board.getViewCount());
    }
}

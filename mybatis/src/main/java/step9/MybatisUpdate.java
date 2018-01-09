package step9;

public class MybatisUpdate {
    public static void main(String[] args) throws Exception {
        BoardDao boardDao = new BoardDao();
        boardDao.setSqlSessionFactory(SqlSessionFactoryBean.getObject());
        
        Board board = new Board();
        
        board.setNo(34);
        board.setTitle("오호라제목");
        board.setContents("내용");
        
        int count = boardDao.update(board);
        
        System.out.printf("%d 개가 수정되었습니다.", count);
        
    }
}

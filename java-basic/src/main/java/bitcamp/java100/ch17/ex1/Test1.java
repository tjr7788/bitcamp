package bitcamp.java100.ch17.ex1;

import java.sql.Connection;

public class Test1 {
    public static void main(String[] args) throws Exception {
        java.sql.Driver driver = new com.mysql.jdbc.Driver();
        Connection con = driver.connect("jdbc:mysql://localhost:3306/studydb?user=study&password=1111", null);
        System.out.println("연결");
        
        con.close();
    }
}

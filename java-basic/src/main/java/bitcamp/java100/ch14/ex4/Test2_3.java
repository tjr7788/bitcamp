package bitcamp.java100.ch14.ex4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test2_3 {
    public static void main(String[] args) throws Exception {
        
        
        ObjectInputStream  in = new ObjectInputStream(new FileInputStream("test2.dat"));
        
        Score4 s = (Score4)in.readObject();
        
        s.compute();
        in.close();
        
        System.out.println(s);
    }
}

package bitcamp.java100.ch16.ex1;

public class Test1 {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        
        
        ThreadGroup g1 = t1.getThreadGroup();
        
        ThreadGroup g2 = g1.getParent();
        
        ThreadGroup[] groups = new ThreadGroup[10];
        int len = g2.enumerate(groups, false);
        for (int i = 0; i < len; i++) {
            System.out.println(groups[i].getName());
        }
        System.out.println("--------------");
        
        Thread[] threads = new Thread[10];
        len = g2.enumerate(threads, false);
        for (int i = 0; i < len; i++) {
            System.out.println(threads[i].getName());
        }
        
        System.out.println("--------------");
        
        len = g1.enumerate(threads, false);
        for (int i = 0; i < len; i++) {
            System.out.println(threads[i].getName());
        }
        
        
    }
}

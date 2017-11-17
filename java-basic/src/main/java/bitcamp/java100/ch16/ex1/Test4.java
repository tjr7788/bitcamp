package bitcamp.java100.ch16.ex1;

public class Test4 {
    
    static class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
        }
        
        @Override
        public void run() {
            int cnt = 0;
            while(true) {
                System.out.printf("%s(%d)\n", this.getName(), ++cnt);
                if(cnt == 500) {
                    cnt = 0;
                    try {
                        Thread.sleep(5000);
                    } catch (Exception e) {}
                }
            }
        }
    }
    
    public static void main(String[] args) {
        new Thread(new MyThread("z")).start();
        
        while (true) {
            System.out.println("...");
            double v1 = 3.141592;
            double v2 = 0.1234542;
            for (int i = 0; i < 10000000; i++) {
                v1 = Math.random() * v1;
                v2 = Math.random() / v2;
            }
        }
        
        
    }
}

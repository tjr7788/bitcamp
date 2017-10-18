
package bitcamp.java100.test17_17.step3;

public class Test {
    static class Rect {
        int w;
        int h;
    }
    
    static float area(Rect rect) {
        return (rect.w * rect.h) / 10000f;
    }
    
    public static void main(String[] args) {
        
        Rect rect = new Rect();
        
        rect.w = 390;
        rect.h = 420;
        
        System.out.println(area(rect));
        
        
        
        
        
    }
}


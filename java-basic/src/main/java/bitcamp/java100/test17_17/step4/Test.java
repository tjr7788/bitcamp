package bitcamp.java100.test17_17.step4;

public class Test {
    
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


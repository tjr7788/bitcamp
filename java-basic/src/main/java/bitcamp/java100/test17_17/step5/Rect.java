package bitcamp.java100.test17_17.step5;

public class Rect {
    int w;
    int h;
    
    static float area(Rect rect) {
        return (rect.w * rect.h) / 10000f;
    }
    
    static float pyeong(Rect rect) {
        return area(rect) / 1000f;
    }   
}


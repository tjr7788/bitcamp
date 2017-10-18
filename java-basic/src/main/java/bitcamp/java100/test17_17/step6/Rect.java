package bitcamp.java100.test17_17.step6;

public class Rect {
    int w;
    int h;
    
    float area() {
        return (this.w * this.h) / 10000f;
    }
    
    float pyeong() {
        return area() * 1.2f;
    }
}


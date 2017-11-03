
package bitcamp.java100;

class Circle {
    private int xPos, yPos, radius;
    
    public Circle(int x, int y, int radius) {
        this.xPos = x;
        this.yPos = y;
        this.radius = radius;
    }
    
    public void showCircleInfo() {
        System.out.printf("radius :  %d\n[%d, %d]\n",this.xPos, this.yPos, this.radius);
    }
}

class Ring {
    void innerCircle(int x, int y, int radius) {
        Circle cc = new Circle(x, y ,radius);
        System.out.println("Inner Circle Info");
        cc.showCircleInfo();
    }
    void outterCircle(int x, int y, int radius) {
        Circle cc = new Circle(x, y ,radius);
        System.out.println("Outter Circle Info");
        cc.showCircleInfo();
    }
}

public class Practice {
    public static void main(String[] args) {
        Ring rg = new Ring();
        rg.innerCircle(3, 3, 5);
        rg.outterCircle(1, 1, 5);
    }
}
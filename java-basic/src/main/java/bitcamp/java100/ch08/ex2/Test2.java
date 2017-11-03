package bitcamp.java100.ch08.ex2;

public class Test2 {

    public static void main(String[] args) {
        Vehicle v;
        v = new Vehicle();
        v = new Boat();
        v = new Car();
        v = new Truck();
        v = new Sedan();
        
        Boat b;
        
        b = new Boat();


        Car c = new Car();
        c.model = "티코";
        c.capacity = 4;
        c.enginType = 1;
        c.cylinder = 4;
        c.valve = 16;
        c = new Truck();
        
        Sedan s;
        s = new Sedan();
    }

}

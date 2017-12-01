package bitcamp.java100.ch20.ex3;

public class Engine {
    private String name;
    private int value;
    private int cc;
    
    public Engine() {
        System.out.println("Engine()생성자 호출");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
        System.out.println("setName");
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
        System.out.println("setValue");
    }
    public int getCc() {
        return cc;
    }
    public void setCc(int cc) {
        this.cc = cc;
        System.out.println("setCc");
    }
}

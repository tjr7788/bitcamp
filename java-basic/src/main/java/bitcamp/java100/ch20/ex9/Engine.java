package bitcamp.java100.ch20.ex9;

public class Engine {
    @Override
    public String toString() {
        return "Engine [name=" + name + ", valve=" + valve + ", cc=" + cc + "]";
    }
    private String name;
    private int valve;
    private int cc;
    
    public Engine() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getValve() {
        return valve;
    }
    public void setValve(int valve) {
        this.valve = valve;
    }
    public int getCc() {
        return cc;
    }
    public void setCc(int cc) {
        this.cc = cc;
    }
    
    
}

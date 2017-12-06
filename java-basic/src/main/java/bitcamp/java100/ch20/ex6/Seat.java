package bitcamp.java100.ch20.ex6;

public class Seat {
    String type;
    boolean heat;
    boolean autoControl;
    
    public Seat() {
        System.out.println("Seat()");
    }
    
    public Seat(String type, boolean heat, boolean autoControl) {
        super();
        this.type = type;
        this.heat = heat;
        this.autoControl = autoControl;
    }
    
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public boolean isHeat() {
        return heat;
    }
    public void setHeat(boolean heat) {
        this.heat = heat;
    }
    public boolean isAutoControl() {
        return autoControl;
    }
    public void setAutoControl(boolean autoControl) {
        this.autoControl = autoControl;
    }
    
}
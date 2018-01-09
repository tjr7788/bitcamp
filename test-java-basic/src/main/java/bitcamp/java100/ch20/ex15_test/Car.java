package bitcamp.java100.ch20.ex15_test;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tico")
public class Car {
    private String model;
    private String color;
    private int capacity;
    
    @Autowired
    private Engine engine;
    
    private Map<String,String> optins;
    
    @Override
    public String toString() {
        return "Car [model=" + model + ", color=" + color + ", capacity=" + capacity + ", engine=" + engine
                + ", optins=" + optins + "]";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Map<String, String> getOptins() {
        return optins;
    }

    public void setOptins(Map<String, String> optins) {
        this.optins = optins;
    }
    
    
}

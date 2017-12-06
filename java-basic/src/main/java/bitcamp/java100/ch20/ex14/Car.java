package bitcamp.java100.ch20.ex14;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bitcamp.java100.ch20.ex6.CD;
import bitcamp.java100.ch20.ex6.Seat;
import bitcamp.java100.ch20.ex6.Tire;

@Component("tico")
public class Car {
    private String model;
    private String color;
    private int capacity;
    
    @Autowired
    private Engine engine;
    
    private Tire[] tires;
    private List<Seat> seats;
    private Set<CD> jukeBox; 
    private Map<String, String> options;
    
    
    public Car() {
        System.out.println("Car()");
    }

    
    @Override
    public String toString() {
        return "Car [model=" + model + ", color=" + color + ", capacity=" + capacity + ", engine=" + engine + ", tires="
                + Arrays.toString(tires) + ", seats=" + seats + ", jukeBox=" + jukeBox + ", options=" + options + "]";
    }
    
    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(Map<String, String> options) {
        this.options = options;
    }




    public Set<CD> getJukeBox() {
        return jukeBox;
    }


    public void setJukeBox(Set<CD> jukeBox) {
        this.jukeBox = jukeBox;
    }


    public List<Seat> getSeats() {
        return seats;
    }


    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
    public Tire[] getTires() {
        return tires;
    }

    public void setTires(Tire[] tires) {
        this.tires = tires;
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
    
}
package bitcamp.java100.ch20.ex6;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory3 implements FactoryBean<Car>{
    
    private Tire[] tires;
    private String model;
    
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Tire[] getTires() {
        return tires;
    }

    public void setTires(Tire[] tires) {
        this.tires = tires;
    }
    
    @Override
    public Car getObject() throws Exception {
        Car car = null;
        switch (model) {
        case "티코" :
            car = createTico();
            break;
        case "티코 골드" : 
            car = createTicoGold();
            break;
        case "소나타" : 
            car = createSonata();
            break;
        case "에쿠스" : 
            car = createEquus();
            break;
        default : 
            car = createBasic();
        }
        car.setTires(tires);
        return car;
    }
    
    @Override
    public Class<?> getObjectType() {
        // TODO Auto-generated method stub
        return Car.class;
    }
    @Override
    public boolean isSingleton() {
        return true;
    }

    private Car createBasic() {
        Car c = new Car();
        
        Engine engine = new Engine();
        engine.setCc(1500);
        engine.setName("비트엔진");
        engine.setValve(16);
        
        c.setEngine(engine);
        
        return c;
    }

    private Car createEquus() {
        Car c = new Car();
        
        Engine engine = new Engine();
        engine.setCc(3500);
        engine.setName("비트수페셜엔진");
        engine.setValve(64);
        
        c.setEngine(engine);
        
        return c;
    }

    private Car createSonata() {
        Car c = new Car();
        
        Engine engine = new Engine();
        engine.setCc(1900);
        engine.setName("비트엔진2");
        engine.setValve(32);
        
        c.setEngine(engine);
        
        return c;
    }

    private Car createTicoGold() {
        Car c = new Car();
        
        Engine engine = new Engine();
        engine.setCc(2900);
        engine.setName("비트엔진골드");
        engine.setValve(16);
        
        c.setEngine(engine);
        
        Map<String, String> options = new HashMap<>();
        options.put("sunroof", "yes");
        options.put("airbag", "yes");
        options.put("blackBox", "yes");
        
        c.setOptions(options);
        
        return c;
    }

    private Car createTico() {
        Car c = new Car();
        
        Engine engine = new Engine();
        engine.setCc(900);
        engine.setName("비트엔진티코");
        engine.setValve(16);
        
        c.setEngine(engine);
        
        return c;
    }
}

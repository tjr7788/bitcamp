package bitcamp.java100.ch20.ex6;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    public static Car createCar(String model) {
        switch (model) {
        case "티코" : return createTico();
        case "티코 골드" : return createTicoGold();
        case "소나타" : return createSonata();
        case "에쿠스" : return createEquus();
        default : return createBasic();
        }
    }

    private static Car createBasic() {
        Car c = new Car();
        
        Engine engine = new Engine();
        engine.setCc(1500);
        engine.setName("비트엔진");
        engine.setValve(16);
        
        c.setEngine(engine);
        
        return c;
    }

    private static Car createEquus() {
        Car c = new Car();
        
        Engine engine = new Engine();
        engine.setCc(3500);
        engine.setName("비트수페셜엔진");
        engine.setValve(64);
        
        c.setEngine(engine);
        
        return c;
    }

    private static Car createSonata() {
        Car c = new Car();
        
        Engine engine = new Engine();
        engine.setCc(1900);
        engine.setName("비트엔진2");
        engine.setValve(32);
        
        c.setEngine(engine);
        
        return c;
    }

    private static Car createTicoGold() {
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

    private static Car createTico() {
        Car c = new Car();
        
        Engine engine = new Engine();
        engine.setCc(900);
        engine.setName("비트엔진티코");
        engine.setValve(16);
        
        c.setEngine(engine);
        
        return c;
    }
}

package bitcamp.java100.ch08.ex1;

class Member3 {
    private String name;
    private int age;
    private float weight;
    private float height;

public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public float getWeight() {
        return weight;
    }


    public void setWeight(float weight) {
        this.weight = weight;
    }


    public float getHeight() {
        return height;
    }


    public void setHeight(float height) {
        this.height = height;
    }



}
public class Test7_3 {
    
    public static void main(String[] args) {
        Member2 m = new Member2();
        m.setName("홍길동");
        m.setAge(20);
        m.setWeight(90.7f);
        m.setHeight(16.0f);
        
        
        
    }
}

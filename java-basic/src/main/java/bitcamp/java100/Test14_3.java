package bitcamp.java100;

public class Test14_3{
    public static void main(String[] args){    
        class Student{
            String name, addr, phone;
            int age;
        }
        Student std;    // reference
        std = new Student();

        std.name = "김석희";
        std.age = 23;
        std.phone = "01010203231";
        std.addr = "경기도 남양주";

        System.out.printf("%s, %d, %s, %s\n",std.name, std.age, std.phone, std.addr);
        }
}
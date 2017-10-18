
package bitcamp.java100;

import java.util.ArrayList;
import java.util.HashSet;

public class Test16_7 {

    public static void main(String[] args) {
        String[] names = {"홍길동", "임꺽정", "유관순", "안중근"};
        for (String n : names)
            System.out.println(n);

        int[] num = {100, 200, 300};
        for (int n : num)
            System.out.println(n);
        ArrayList<String> list = new ArrayList<String>();
        list.add("홍길동");
        list.add("홍길동5");
        list.add("홍길동4");
        list.add("홍길동2");
        list.add("홍길동6");
        list.add("홍길동");
        list.add("홍길동5");
        list.add("홍길동4");
        for (String n : list)
            System.out.println(n);
        System.out.println("--------------");
        HashSet<String> list2 = new HashSet<String>();
        list2.add("홍길동");
        list2.add("홍길동5");
        list2.add("홍길동4");
        list2.add("홍길동2");
        list2.add("홍길동6");
        list2.add("홍길동6");
        list2.add("홍길동");
        list2.add("홍길동5");
        list2.add("홍길동4");
        for (String n : list2)
            System.out.println(n);
    }
}

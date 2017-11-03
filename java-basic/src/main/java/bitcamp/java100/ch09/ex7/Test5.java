package bitcamp.java100.ch09.ex7;

import java.util.HashSet;

public class Test5 {
    
    static class Contact {
        String name;
        
        public Contact(String name) {
            this.name = name;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Contact other = (Contact) obj;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            return true;
        }
    }
    public static void main(String[] args) {
        
        HashSet<Contact> list = new HashSet<>();
        Contact c1 = new Contact("홍길동");
        Contact c2 = new Contact("홍길동");
        Contact c3 = new Contact("홍길동");
        
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        
        
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        
        list.add(c1);
        list.add(c2);
        list.add(c3);
        
        System.out.println(list.size());
        Contact[] arr = new Contact[list.size()];
        list.toArray(arr);
        for (Contact c : arr) {
            System.out.println(c.name);
        }
        
        
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        
//        list.add(s1);   //같은 값은 중복 안된다.
//        
//        list.add(null); //null값 가능
//        
//        System.out.println(list.size());
//        
//        String[] arr = new String[list.size()];
//        String[] arr2 = list.toArray(arr);
//        
//        if (arr == arr2) {
//            System.out.println("같다");
//        }
//        else {
//            System.out.println("arr != arr2");
//        }
//        
//        for(String s : arr) {  //저장순서대로 꺼내기 가능
//            System.out.println(s);
//        }
    }
}


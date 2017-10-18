

package bitcamp.java100;

public class Test16_4 {

    public static void main(String[] args) {
        int i = 0;
        while (i < 5)
            System.out.println(i++);


        System.out.println("--------------");


        i = 0;
        while (i <= 5) {
            int count = 1;
            while (count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            i++;
        }

        System.out.println("--------------");


        i = 0;
        while (i <= 5) {
            int count = 4;

            while (count >= i) {
                System.out.print(" ");
                count--;
            }
            count = 1;

            while (count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            i++;
        }

        System.out.println("--------------");

        i = 1;
        while (i <= 5) {
            int count = 4;

            while (count >= i) {
                System.out.print(" ");
                count-=2;
            }
            count = 1;

            while (count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            i+=2;
        }

        System.out.println("--------------");

        i = 5;
        while (i >= 0) {
            int count = 4;

            while (count >= i) {
                System.out.print(" ");
                count-=2;
            }
            count = 1;

            while (count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            i-=2;
        }

        System.out.println("--------------");
        i = 1;
        label1: {

            while (i <= 10) {
                int count = 1;

                while (count <= i) {
                    System.out.print("*");
                    if (count == 5) {
                        break label1;
                    }
                    count++;
                }
                System.out.println("");
                i++;
            }
        }
        System.out.println("--------------");
        
        i = 2;
        while(i <= 9) {
            int count = 1;
            while(count <= 9) {
                System.out.printf("%d * %d = %d\n",i,count,i*count);
                count++;
            }
            i++;
        }
        System.out.println("--------------");
        i = 987654321;
        while(i > 0) {
            System.out.println(i%-10);
            i/=10;
        }
        
        
        System.out.println("--------------");
        
        i = 987654321;
        
        String num = Integer.toString(i);
        for (int ii = 0; ii < num.length(); ii++) {
            System.out.println(num.charAt(ii)-'0');
        }
        
        
        
        
        System.out.println();
        
        
        System.out.println("--------------");
        
        
//        i = 4885323;
//        int[] arr = new int[9];
//        
//        while(i > 0) {
//            arr[i%10]++;
//            i /= 10;
//        }
//        int x = 0;
//        while(x < arr.length) {
//            System.out.printf("%d = %d\n", x, arr[x]);
//            x++;
//        }
//        
        
    }
}

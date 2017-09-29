
package bitcamp.java100;

public class Test15_8{

    public static void main(String[] args) {
        //and 연산자
        System.out.printf("true && true ? %b\n", true && true);
        System.out.printf("true && false ? %b\n", true && false);
        System.out.printf("false && false ? %b\n", false && false);     

        //or 연산자
        System.out.printf("true || true ? %b\n", true || true);
        System.out.printf("true || false ? %b\n", true || false);
        System.out.printf("false ||  false ? %b\n", false || false);



        //and 연산자
        System.out.printf("true & true ? %b\n", true & true);
        System.out.printf("true & false ? %b\n", true & false);
        System.out.printf("false & false ? %b\n", false & false);     
        
        //or 연산자
        System.out.printf("true | true ? %b\n", true | true);
        System.out.printf("true | false ? %b\n", true | false);
        System.out.printf("false |  false ? %b\n", false | false);


        boolean b1 = false;
        boolean result = false&&(b1=true);
        System.out.printf("b1 = %b, result = %b\n",b1,result);
        
        b1 = false;
        result = false&(b1=true);
        System.out.printf("b1 = %b, result = %b\n",b1,result);
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine().trim());
        while (num-- > 0) {
            String[] number = br.readLine().trim().split(" ");

            int a = Integer.parseInt(number[1]) - Integer.parseInt(number[0]);
            int max = a / 2;
            int sum = 0;
            int cnt = 0;
            int speed = 0;
            int len = 0;

            for (int i = 1; sum <= max; i++) {
                len += i;
                sum += i;
                cnt++;
                speed = i;
                System.out.println("이동거리" + len);
            }
            
            for (int i = speed; sum > 0; i--) {
                
                cnt++;
                sum -= i;
                len += i;
                
                System.out.println("이동거리" + len);
            }

            if (a <= 4) {
                System.out.println(3);
            } else {
                System.out.println(cnt);
            }
        }
    }
}
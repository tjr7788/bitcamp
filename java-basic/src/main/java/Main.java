import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().trim();
        int cnt = 1;
        for(int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}

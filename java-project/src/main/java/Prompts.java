import java.util.Scanner;

public class Prompts {
    static Scanner sc = new Scanner(System.in);
    
    
    public static String input(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static boolean confirm(String message) {
        System.out.print(message);
        String word = sc.nextLine().toLowerCase();
        if (word.equals("y") || word.equals("yes") || word.equals("")) {
            return true;
        }
        return false;
    }

    public static boolean confirm2(String message) {
        System.out.print(message);
        String word = sc.nextLine().toLowerCase();
        if (word.equals("n") || word.equals("no") || word.equals("")) {
            return false;
        }
        return true;
    }
}

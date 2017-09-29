public class App {
    public static void main(String[] args) {
        String[] name = {"홍길동","임꺽정","유관순"};
        int[] kor = {100,80,100};
        int[] math = {80,80,100};
        int[] eng = {90,80,100};
        for(int i = 0; i < name.length; i++){
            int sum = kor[i] + math[i] + eng[i];
            float avg = sum / 3.0f;
            System.out.printf("%-4s, %4d, %4d, %4d, %4d, %5.1f\n", name[i], kor[i], math[i], eng[i], sum, avg);
        }
    }
}
package work2;

public class Code5_7 {
    public static void main(String[] args) {
        double sum = 10000;
        for (int i = 0; i < 10; i++) {
            sum = sum * 1.05;
        }
        double ans = 0;
        for (int i = 0; i < 4; i++) {
            ans += sum;
            sum = sum * 1.05;
        }
        System.out.println(ans);
    }
}

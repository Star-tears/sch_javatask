package work2;

public class Code5_25 {
    public static void main(String[] args) {
        for (int i = 10000; i <= 100000; i += 10000) {
            System.out.println("i = " + i + ", PI = " + cal(i));
        }
    }

    public static double cal(int n) {
        double ans = 0;
        int sign = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans + sign * 1.0 / (2 * i - 1);
            sign = -sign;
        }
        return 4 * ans;
    }
}

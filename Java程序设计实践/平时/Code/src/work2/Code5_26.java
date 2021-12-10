package work2;

public class Code5_26 {
    public static void main(String[] args) {
        for (int i = 10000; i <= 100000; i += 10000) {
            System.out.println("i = " + i + ", e = " + cal(i));
        }
    }

    public static double cal(int n) {
        double ans = 1;
        double num = 1;
        for (int i = 1; i <= n; i++) {
            num = num / i;
            ans = ans + num;
        }
        return ans;
    }
}

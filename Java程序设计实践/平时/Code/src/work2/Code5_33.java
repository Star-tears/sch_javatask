package work2;

public class Code5_33 {
    public static void main(String[] args) {
        for (int i = 1; i < 10000; i++) {
            if (isnum(i))
                System.out.println(i);
        }
    }

    public static boolean isnum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum == n;
    }
}

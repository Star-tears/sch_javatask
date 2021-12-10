package work2;

public class Code5_19 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("    ");
            }
            for (int j = 1; j < 2 * i - 1; j++) {
                int mi = j - 1;
                if (j > i)
                    mi = mi - 2 * (j - i);
                int num = (int) Math.pow(2, mi);
                System.out.format("%4d", num);
            }
            int num = 1;
            System.out.format("%4d\n", num);
        }
    }
}

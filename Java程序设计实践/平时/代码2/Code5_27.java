public class Code5_27 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 101; i <= 2100; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                ++sum;
                if (sum % 10 != 0)
                    System.out.print(i + " ");
                else
                    System.out.println(i);
            }
        }
        System.out.println("");
        System.out.println("sum = " + sum);
    }
}

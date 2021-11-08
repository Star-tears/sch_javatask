package work2;

import java.util.Scanner;

public class Code5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j < 2 * i - 1; j++) {
                int num = Math.abs(i - j) + 1;
                System.out.format("%3d", num);
            }
            int num = i;
            System.out.format("%3d\n", num);
        }
        input.close();
    }
}

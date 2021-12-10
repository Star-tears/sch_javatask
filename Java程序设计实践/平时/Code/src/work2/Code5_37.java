package work2;

import java.util.Scanner;

public class Code5_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a digit: ");
        int num = input.nextInt();
        int[] a = new int[100];
        int len = 0;
        while (num != 0) {
            a[++len] = num % 2;
            num /= 2;
        }
        for (int i = len; i >= 1; i--) {
            System.out.print(a[i]);
        }
        input.close();
    }
}

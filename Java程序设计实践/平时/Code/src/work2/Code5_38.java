package work2;

import java.util.Scanner;

public class Code5_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a digit: ");
        int num = input.nextInt();
        int[] a = new int[1000];
        int len = 0;
        while (num != 0) {
            a[++len] = num % 8;
            num /= 8;
        }
        for (int i = len; i > 0; i--) {
            System.out.print(a[i]);
        }
        input.close();
    }
}

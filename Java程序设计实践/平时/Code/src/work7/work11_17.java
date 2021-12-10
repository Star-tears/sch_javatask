package work7;

import java.util.Scanner;

public class work11_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer m: ");

        int m = input.nextInt();

        int[] array = new int[1000];
        int p = 2;
        int temp = m;
        while (temp != 1) {
            if (temp % p == 0) {
                temp = temp / p;
                array[p]++;
            } else {
                p++;
            }
        }
        int ans = 1;
        for (int i = 2; i < array.length; i++) {
            if ((array[i] & 1) == 1) {
                ans *= i;
            }
        }
        int ans2 = ans * m;

        System.out.println("The smallest number for m * n to be a perfect square is " + ans);
        System.out.println("m * n is " + ans2);

        input.close();
    }
}

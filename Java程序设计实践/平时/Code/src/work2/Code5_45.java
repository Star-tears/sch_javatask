package work2;

import java.util.Scanner;

public class Code5_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double[] num = new double[10];
        for (int i = 0; i < 10; i++) {
            num[i] = input.nextDouble();
        }
        System.out.print("The mean is ");
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += num[i];
        }
        System.out.format("%.2f\n", sum / 10);

        System.out.print("The standard deviation is ");
        double sum2 = 0;
        for (int i = 0; i < 10; i++) {
            sum2 += num[i] * num[i];
        }
        System.out.format("%.5f\n", Math.sqrt((sum2 - sum * sum / 10) / (9)));

        input.close();
    }
}

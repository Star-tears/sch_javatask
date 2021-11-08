package work2;

import java.util.Scanner;

public class Code5_28 {
    public static void main(String[] args) {
        int[] a = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] day = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        String[] month = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };

        Scanner input = new Scanner(System.in);
        System.out.print("Year: ");
        int year = input.nextInt();
        System.out.print("The first day of the year is: ");
        int num = input.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            a[2] += 1;
        }
        for (int i = 0; i < 12; i++) {
            num += a[i];
            System.out.println(month[i] + " 1, " + year + " is " + day[num % 7]);
        }
        input.close();
    }
}

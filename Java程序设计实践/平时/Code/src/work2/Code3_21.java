package work2;

import java.util.Scanner;

public class Code3_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] ans = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
        System.out.print("Enter year: (e.g., 2021): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int day = input.nextInt();
        if (month == 1 || month == 2) {
            month = month + 12;
            --year;
        }
        int j = year / 100;
        int k = year % 100;
        int h = (day + 26 * (month + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        System.out.println("Day of the week is " + ans[h]);
        input.close();
    }
}

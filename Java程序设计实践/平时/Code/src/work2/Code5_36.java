package work2;

import java.util.Scanner;

public class Code5_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String id = input.next();
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            sum += (id.charAt(i - 1) - '0') * i;
        }
        sum = sum % 11;
        char ans = (char) (sum + '0');
        if (sum == 10)
            ans = 'X';
        System.out.println("The ISBN-10 number is " + id + ans);
        input.close();
    }
}
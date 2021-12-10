package work2;

import java.util.Scanner;

public class Code5_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double amount = input.nextDouble();
        System.out.print("Number of Years: ");
        int year = input.nextInt();
        System.out.println("Interest Rate    Monthly Payment    Total Payment");
        for (double i = 5; i <= 8; i += 0.125) {
            double monthlyInterestRate = i / 1200;
            double monthlyPayment = amount * monthlyInterestRate
                    / (1 - 1 / Math.pow(1 + monthlyInterestRate, year * 12));
            double totalPayment = monthlyPayment * year * 12;
            System.out.format("%.3f%%           %.2f             %.2f\n", i, monthlyPayment, totalPayment);
        }
        input.close();
    }
}

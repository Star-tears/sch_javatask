import java.util.Scanner;

public class Code5_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double amount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double rate = input.nextDouble();
        double monthlyInterestRate = rate / 1200;
        double monthlyPayment = amount * monthlyInterestRate
                / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double balance = amount;
        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment: " + totalPayment + "\n");

        System.out.println("Payment#" + "\t" + "Interest" + "\t" + "Principal" + "\t" + "Balance");
        for (int i = 1; i <= numberOfYears * 12; i++) {
            double interest = monthlyInterestRate * balance;
            double principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.println(i + "\t\t" + String.format("%.2f", interest) + "\t\t" + String.format("%.2f", principal)
                    + "\t\t" + String.format("%.2f", balance));
        }
        input.close();
    }
}

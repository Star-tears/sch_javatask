import java.util.Scanner;

public class Code3_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the three sides of the triangle: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b) {
            double ans = a + b + c;
            System.out.println("Perimeter of triangle is: " + ans);
        } else {
            System.out.println("Invalid triangle");
        }
        input.close();
    }
}

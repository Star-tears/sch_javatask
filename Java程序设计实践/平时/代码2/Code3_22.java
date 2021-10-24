import java.util.Scanner;

public class Code3_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double dis = Math.sqrt(x * x + y * y);
        if (dis <= 10)
            System.out.println("Point (" + x + ", " + y + ") is in the circle");
        else
            System.out.println("Point (" + x + ", " + y + ") is not in the circle");
        input.close();
    }
}

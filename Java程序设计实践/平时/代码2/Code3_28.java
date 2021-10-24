import java.util.Scanner;

public class Code3_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();
        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();

        double left1 = x1 - width1 / 2.0;
        double right1 = x1 + width1 / 2.0;
        double up1 = y1 + height1 / 2.0;
        double down1 = y1 - height1 / 2.0;
        double left2 = x2 - width2 / 2.0;
        double right2 = x2 + width2 / 2.0;
        double up2 = y2 + height2 / 2.0;
        double down2 = y2 - height2 / 2.0;

        if (left1 <= left2 && right1 >= right2 && up1 >= up2 && down1 <= down2)
            System.out.println("r2 is inside r1");
        else if (up1 < down2 || down1 > up2 || right1 < left2 || left1 > right2)
            System.out.println("r2 does not overlap r1");
        else
            System.out.println("r2 overlap r1");
        input.close();
    }

}

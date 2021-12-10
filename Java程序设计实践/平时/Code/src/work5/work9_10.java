package work5;

import java.util.Scanner;

public class work9_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out.print("请输入a,b,c：");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        if (qe.isSolvable()) {
            System.out.println("x1 = " + qe.getRoot1());
            System.out.println("x2 = " + qe.getRoot2());
        } else {
            System.out.println("无实数根");
        }
        input.close();
    }
}

class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public boolean isSolvable() {
        return getDiscriminant() >= 0;
    }

}
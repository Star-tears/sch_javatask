package work5;

import java.util.Scanner;

public class work9_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, d, e, f;
        System.out.print("请输入a,b,c,d,e,f：");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();
        LinearEquation le = new LinearEquation(a, b, c, d, e, f);
        if (le.isSolvable()) {
            System.out.println("x = " + le.getX());
            System.out.println("y = " + le.getY());
        } else {
            System.out.println("无实数根");
        }
        input.close();
    }
}

class LinearEquation {
    private double a, b, c, d, e, f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double get_a() {
        return a;
    }

    public double get_b() {
        return b;
    }

    public double get_c() {
        return c;
    }

    public double get_d() {
        return d;
    }

    public double get_e() {
        return e;
    }

    public double get_f() {
        return f;
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }

    public boolean isSolvable() {
        return a * d - b * c != 0;
    }

}

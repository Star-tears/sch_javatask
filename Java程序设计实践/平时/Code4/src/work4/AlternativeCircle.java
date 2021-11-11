package work4;

public class AlternativeCircle {
    public static void main(String[] args) {
        AlternativeCircle circle1 = new AlternativeCircle();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

        AlternativeCircle circle2 = new AlternativeCircle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

        AlternativeCircle circle3 = new AlternativeCircle(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

        circle2.radius = 100;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
    }

    double radius;

    AlternativeCircle() {
        radius = 1;
    }

    AlternativeCircle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }
}

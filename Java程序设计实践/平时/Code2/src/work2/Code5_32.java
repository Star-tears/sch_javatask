package work2;

public class Code5_32 {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        while (num2 == num1) {
            num2 = (int) (Math.random() * 10);
        }
        System.out.println(num1 + " " + num2);
    }
}

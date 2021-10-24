import java.util.Scanner;

public class Code3_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int num0 = (int) (Math.random() * 900 + 100);
        int[] c = new int[10];
        int[] a = new int[3];
        a[0] = num0 / 100;
        a[1] = num0 / 10 % 10;
        a[2] = num0 % 10;
        for (int i = 0; i < 3; i++) {
            ++c[a[i]];
        }
        int num = input.nextInt();
        int[] b = new int[3];
        b[0] = num / 100;
        b[1] = num / 10 % 10;
        b[2] = num % 10;
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (c[b[i]] != 0) {
                --c[b[i]];
                count++;
            }
        }
        if (a[0] == b[0] && a[1] == b[1] && a[2] == b[2]) {
            System.out.println("You will win: 10000");
        } else if (count == 3) {
            System.out.println("You will win: 3000");
        } else if (count >= 1) {
            System.out.println("You will win: 1000");
        } else {
            System.out.println("No price");
        }
        input.close();
    }
}

import java.util.Scanner;

public class Code8_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        int num = input.nextInt();
        solve(num);
        input.close();
    }

    public static void solve(int num) {
        int[][] val = new int[3][3];
        for (int i = 2; i >= 0; i--) {
            for (int j = 2; j >= 0; j--) {
                val[i][j] = num % 2;
                num /= 2;
            }
        }
        for (int i = 0; i < val.length; i++) {
            for (int j = 0; j < val[i].length; j++) {
                if (val[i][j] == 1)
                    System.out.printf("T ");
                else
                    System.out.print("H ");
            }
            System.out.println("");
        }
    }
}

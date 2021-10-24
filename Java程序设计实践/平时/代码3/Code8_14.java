import java.util.Scanner;

public class Code8_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int num = input.nextInt();

        char[][] s = new char[num][num];
        for (int i = 0; i < num; i++) {
            String str = input.next();
            s[i] = str.toCharArray();
        }
        solve(s, num);
        input.close();
    }

    public static void solve(char[][] s, int num) {
        findrow(s, num);
        findcol(s, num);
        findmajar(s, num);
        findsub(s, num);
    }

    public static void findrow(char[][] s, int num) {
        boolean flag1 = true;
        for (int i = 0; i < num; i++) {
            boolean flag2 = true;
            for (int j = 1; j < num; j++) {
                if (s[i][j] != s[i][0]) {
                    flag2 = false;
                    break;
                }
            }
            if (flag2) {
                int row = i + 1;
                System.out.println("All " + s[i][0] + "s on row " + row);
                flag1 = false;
            }
        }
        if (flag1) {
            System.out.println("No same numbers on a row");
        }
    }

    public static void findcol(char[][] s, int num) {
        boolean flag1 = true;
        for (int i = 0; i < num; i++) {
            boolean flag2 = true;
            for (int j = 1; j < num; j++) {
                if (s[j][i] != s[0][j]) {
                    flag2 = false;
                    break;
                }
            }
            if (flag2) {
                int column = i + 1;
                System.out.println("All " + s[0][i] + "s on column " + column);
                flag1 = false;
            }
        }
        if (flag1) {
            System.out.println("No same numbers on a column");
        }
    }

    public static void findmajar(char[][] s, int num) {
        boolean flag = true;
        for (int i = 1; i < num; i++) {
            if (s[i][i] != s[0][0]) {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("All " + s[0][0] + "s on the major diagonal");
        else
            System.out.println("No same numbers on the major diagonal");
    }

    public static void findsub(char[][] s, int num) {
        boolean flag = true;
        for (int i = 1; i < num; i++) {
            if (s[i][num - i - 1] != s[0][num - 1]) {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("All " + s[0][num - 1] + "s on the sub-diagonal");
        else
            System.out.println("No same numbers on the sub-diagonal");
    }
}

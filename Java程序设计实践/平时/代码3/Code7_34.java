import java.util.Scanner;
import java.util.Arrays;

public class Code7_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.next();
        s = sort(s);
        System.out.print("String sorted is: ");
        System.out.println(s);
        input.close();
    }

    public static String sort(String s) {
        char[] str = s.toCharArray();
        Arrays.sort(str);
        String tmp = new String(str);
        return tmp;
    }
}

package work5;

import java.util.Date;

public class work9_3 {
    public static void main(String[] args) {
        long l = 10000;

        Date date = new Date(l);
        printDate(l, date);
        l *= 10;

        for (int i = 0; i < 7; i++) {
            date.setTime(l);
            printDate(l, date);
            l *= 10;
        }
    }

    // 用于显示日期
    public static void printDate(long l, Date date) {
        System.out.println(l + ": " + date.toString());
    }
}

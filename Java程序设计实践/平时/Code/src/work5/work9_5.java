package work5;

import java.util.GregorianCalendar;

public class work9_5 {

    public static void main(String[] args) {

        GregorianCalendar calender = new GregorianCalendar();
        System.out.println("now: " + calender.get(GregorianCalendar.YEAR) + "."
                + (calender.get(GregorianCalendar.MONTH) + 1) + "." + calender.get(GregorianCalendar.DAY_OF_MONTH));

        calender.setTimeInMillis(1234567898765L);
        System.out.println("after set: " + calender.get(GregorianCalendar.YEAR) + "."
                + (calender.get(GregorianCalendar.MONTH) + 1) + "." + calender.get(GregorianCalendar.DAY_OF_MONTH));

    }

}

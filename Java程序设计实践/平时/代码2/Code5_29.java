import java.util.Scanner;

public class Code5_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Years: ");
        int year = input.nextInt();
        System.out.print("The first day of the year: ");
        int startDay = input.nextInt();

        printMonthTitle(1, year);
        int whatDay = printMonthBody(startDay, 1, year);
        for (int month = 2; month <= 12; month++) {
            printMonthTitle(month, year);
            whatDay = printMonthBody(whatDay, month, year);
        }
        input.close();
    }

    public static boolean isLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            return true;
        else
            return false;
    }

    public static int[] makeSureDays(int year) {
        int[] leapDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int[] nonLeapDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (isLeap(year))
            return leapDays;
        else
            return nonLeapDays;
    }

    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
        case 1:
            monthName = "January";
            break;
        case 2:
            monthName = "February";
            break;
        case 3:
            monthName = "March";
            break;
        case 4:
            monthName = "April";
            break;
        case 5:
            monthName = "May";
            break;
        case 6:
            monthName = "June";
            break;
        case 7:
            monthName = "July";
            break;
        case 8:
            monthName = "August";
            break;
        case 9:
            monthName = "September";
            break;
        case 10:
            monthName = "October";
            break;
        case 11:
            monthName = "November";
            break;
        case 12:
            monthName = "December";
        }

        return monthName;
    }

    public static void printMonthTitle(int month, int year) {
        String monthName = getMonthName(month);
        System.out.println("         " + monthName + " " + year);

        System.out.println("-----------------------------");

        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static int printMonthBody(int whatDay, int month, int year) {
        // whatDay is the first day of the month

        int track = 0;
        for (int j = 0; j < (whatDay % 7); j++) {
            System.out.print("    ");
            track++;
        }
        int[] days = makeSureDays(year);
        // days[month - 1]
        for (int i = 1; i <= days[month - 1]; i++) {
            System.out.printf("%4d", i);
            track++;
            if (track % 7 == 0) {
                System.out.printf("\n");
            }
        }
        System.out.printf("\n");
        return (track % 7);
    }
}

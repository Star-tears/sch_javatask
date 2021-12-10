package work1;

public class ShowCurrenrTime {
    public static void main(String[] args) {
        long totalMillis = System.currentTimeMillis();
        long totalSeconds = totalMillis / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours + 8) % 24;
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT+8");
    }
}

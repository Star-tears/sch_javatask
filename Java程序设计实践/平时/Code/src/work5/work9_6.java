package work5;

import java.util.Date;
import java.util.Random;

public class work9_6 {
    public static void main(String[] args) {
        final int NUM = 100000;

        int[] number = new int[NUM];
        Random random = new Random();

        for (int i = 0; i < NUM; i++)
            number[i] = random.nextInt(100000);

        StopWatch stopWatch = new StopWatch();
        sort(number);
        stopWatch.stop();

        System.out.println(stopWatch.getElapsedTime() + "ms");

    }

    // 选择排序
    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int tmp = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[tmp])
                    tmp = j;
            }
            int temp = a[tmp];
            a[tmp] = a[i];
            a[i] = temp;
        }
    }

}

class StopWatch {

    private Date startTime;
    private Date endTime;

    public StopWatch() {
        startTime = new Date();
    }

    public void start() {
        startTime = new Date();
    }

    public void stop() {
        endTime = new Date();
    }

    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

}

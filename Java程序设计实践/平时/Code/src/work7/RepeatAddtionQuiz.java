package work7;

import java.util.Scanner;
import java.util.ArrayList;

public class RepeatAddtionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        int answer = -1;
        while (answer != number1 + number2) {
            System.out.print("What is " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
            if (answer == number1 + number2) {
                continue;
            }
            if (list.contains(answer)) {
                System.out.println("You already entered " + answer + ".");
            } else {
                System.out.print("Wrong answer. Try again. ");
                list.add(answer);
            }
        }
        System.out.println("You got it!");

        input.close();
    }
}

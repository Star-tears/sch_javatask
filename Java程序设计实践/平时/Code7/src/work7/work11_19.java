package work7;

import java.util.Scanner;
import java.util.ArrayList;

public class work11_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of objects: ");
        int num = input.nextInt();
        System.out.print("Enter the weights of the objects: ");

        ArrayList<Integer> weights = new ArrayList<Integer>();
        for (int i = 0; i < num; i++) {
            weights.add(input.nextInt());
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        int[] V = new int[100];
        for (int i = 0; i < 100; i++) {
            V[i] = 10;
        }
        int cnt = 0, pos = 0;
        while (pos < weights.size()) {
            boolean flag = true;
            for (int i = 0; i < cnt; i++) {
                if (weights.get(pos) <= V[i]) {
                    V[i] -= weights.get(pos);
                    ans.get(i).add(weights.get(pos));
                    flag = false;
                    break;
                }
            }
            if (flag) {
                cnt++;
                ans.add(new ArrayList<Integer>());
                ans.get(cnt - 1).add(weights.get(pos));
                V[cnt - 1] -= weights.get(pos);
            }
            ++pos;
        }

        for (int i = 0; i < ans.size(); i++) {
            System.out.printf("Container %d contains objects with weight", i + 1);
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(" " + ans.get(i).get(j));
            }
            System.out.println("");
        }
        input.close();
    }
}

package work2;

public class Code3_24 {
    public static void main(String[] args) {
        String[] color = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] num = { "", "Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
        int c = (int) (Math.random() * 4);
        int n = (int) (Math.random() * 14 + 1);
        System.out.println("The card you picked is " + num[n] + " of " + color[c]);
    }
}

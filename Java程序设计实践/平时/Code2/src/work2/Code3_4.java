package work2;

public class Code3_4 {
    public static void main(String arg[]) {
        String[] s = new String[] { " ", "Januray", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December" };
        int num = (int) (Math.random() * 12) + 1;
        System.out.println(s[num]);
    }
}
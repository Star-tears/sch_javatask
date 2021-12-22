package work8;

import java.util.*;

public class BookInfo {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> bookInfo = new HashMap<>();
        bookInfo.put("ID001", new ArrayList<>(Arrays.asList("ID001", "Java程序设计", "99.00", "机械工业出版社")));
        bookInfo.put("ID002", new ArrayList<>(Arrays.asList("ID002", "算法竞赛入门经典", "49.80", "清华大学出版社")));
        bookInfo.put("ID003", new ArrayList<>(Arrays.asList("ID003", "牛津高阶英汉词典", "138.00", "牛津大学出版社")));
        bookInfo.put("ID004", new ArrayList<>(Arrays.asList("ID004", "C++ Primer", "128.0", "电子工业出版社")));
        for (String keys : bookInfo.keySet()) {
            for (String val : bookInfo.get(keys)) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }
}

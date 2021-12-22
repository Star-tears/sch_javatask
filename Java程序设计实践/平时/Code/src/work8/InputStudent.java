package work8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class InputStudent {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        File file = new File("src/work8/Student.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        PrintWriter pr = new PrintWriter(new FileWriter(file));
        Set<Student> students = new TreeSet<>();
        while (true) {
            String id = in.next();
            if (id.equals("exit"))
                break;
            String name = in.next();
            int age = in.nextInt();
            students.add(new Student(id, name, age));
        }
        for (Student student : students) {
            pr.println(student.getId() + " " + student.getName() + " " + student.getAge());
        }
        pr.close();
        in.close();

    }
}

package work8;

public class Student implements Comparable {
    private String id;
    private String name;
    private int age;

    public Student(String _id, String _name, int _age) {
        this.id = _id;
        this.name = _name;
        this.age = _age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Student)) {
            throw new RuntimeException("不是Student对象");
        }
        Student p = (Student) o;
        if (this.age > p.age)
            return 1;
        if (this.age == p.age) {
            return this.name.compareTo(p.name);
        }
        return -1;
    }
}

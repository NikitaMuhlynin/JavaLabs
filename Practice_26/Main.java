import java.util.Objects;

class Student {
    private String name;
    private int age;
    private String group;

    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student other = (Student) obj;
        return age == other.age &&
               Objects.equals(name, other.name) &&
               Objects.equals(group, other.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, group);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Никита", 20, "ФизМех-01");
        Student s2 = new Student("Никита", 20, "ФизМех-01");
        Student s3 = new Student("Петр", 21, "ИКНК-02");

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
    }
}
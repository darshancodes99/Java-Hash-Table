import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class HashSet_Problem {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();

        hashSet.add(new Student(1, "kartik"));
        hashSet.add(new Student(2, "maulik"));
        hashSet.add(new Student(3, "hasrh"));
        hashSet.add(new Student(3, "hasrh"));

        for (Student student : hashSet) {
            System.out.println(student.rollNo + " " + student.name);
        }

        System.out.println("Size of HashSet: " + hashSet.size());
    }


}

class Student {
     int rollNo;
     String name;
     Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name);
    }
}

package homework10Part1;

public class Student {
    String nameAndSurname;
    int age;
    int course;
    String mainSubject;
    String faculty;

    void learning() {
        System.out.println("Learning");
    }

    public Student(String nameAndSurname, int age) {
        this.nameAndSurname = nameAndSurname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameAndSurname='" + nameAndSurname + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", mainSubject='" + mainSubject + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}

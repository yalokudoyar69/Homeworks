package homework14;

public class Student extends Person {

    private String faculty;

    public Student(String name, String gender, int age, String faculty) {
        super(name, gender, age);
        this.faculty = faculty;
    }

    public Student() {
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", faculty='" + faculty + '\'' +
                '}';
    }

    @Override
    public String getType() {
        return "Student";

    }
}

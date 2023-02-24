package homework10Part1;

public class Student {
    private String nameAndSurname;
    private int age;
    private int course;
    private String mainSubject;
    private String faculty;

    void learning() {
        System.out.println("Learning");
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getMainSubject() {
        return mainSubject;
    }

    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
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

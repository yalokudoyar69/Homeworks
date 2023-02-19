package homework10Part1;

public class Teacher {
     private String nameAndSurname;
    private String background;
    private String subject;
    private int age;

    void lecturing() {
        System.out.println("Lecturing");
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "nameAndSurname='" + nameAndSurname + '\'' +
                ", background='" + background + '\'' +
                ", subject='" + subject + '\'' +
                ", age=" + age +
                '}';
    }
}

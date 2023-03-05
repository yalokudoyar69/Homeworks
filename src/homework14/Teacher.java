package homework14;

public class Teacher extends Person {

    private String subject;

    public Teacher(String name, String gender, int age, String subject) {
        super(name, gender, age);
        this.subject = subject;
    }

    public Teacher() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", subject='" + subject + '\'' +
                '}';
    }

    @Override
    public String getType() {
        return "Teacher";
    }
}

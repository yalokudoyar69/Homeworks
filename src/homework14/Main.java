package homework14;

//Створити набір класів, який описує студентів та викладачів за допомогою абстракцій.
public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();

        System.out.println(student.getType() + student);
        System.out.println(teacher.getType() + teacher);
    }
}

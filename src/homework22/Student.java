package homework22;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private String surname;
    private double averageScore;

    public Student(String surname, double averageScore) {
        this.surname = surname;
        this.averageScore = averageScore;
    }

    public Student() {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student students = (Student) o;
        return averageScore == students.averageScore && Objects.equals(surname, students.surname);
    }

    @Override
    public int compareTo(Student o) {
        return getSurname().compareTo(o.getSurname());
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}

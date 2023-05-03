package homework22;

//Створити клас студент з полями Прізвище та Середній бал. Написати два компаратори для сортування по цим полям.
//У головному класі наповнити лист даними про студентів та відсортувати за допомогою цих компараторів.
//Показати на консоль 3 варіанти листа: оригінальний та 2 відсортованих.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Makarov",3.8));
        students.add(new Student("Vishnevsky", 2.4));
        students.add(new Student("Limonov", 3.9));

        System.out.println("Original list:");
        for (int i = 0; i < students.size(); i++)
            System.out.println(students.get(i));

        Collections.sort(students, new StudentSurnameComparator());
        System.out.println("Sorted by surname:");
        for (int i = 0; i < students.size(); i++)
            System.out.println(students.get(i));

        Collections.sort(students, new StudentAverageScore());
        System.out.println("Sorted by average score:");
        for (int i = 0; i < students.size(); i++)
            System.out.println(students.get(i));

    }

    }





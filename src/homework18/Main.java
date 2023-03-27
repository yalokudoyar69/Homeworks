package homework18;

//1. Створити програму для збереження списку чисел з 10 елементів та іншого з 2 000 000 елементів.
// Для кожного підібрати свій тип.
//2. Зберегти у колекції список студентів (класс Студент теж створити).
//3. Вивести цей список.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        ArrayList<Integer> smallList = new ArrayList<>();
//        for (int i = 1; i <= 10; i++) {
//            smallList.add(i);
//        }
//
//        LinkedList<Integer> hugeList = new LinkedList<>();
//        for (int i = 1; i <= 2000000; i++) {
//            hugeList.add(i);
//        }
//    }

        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student("Vasya_Pupkin", 18, "biochemistry"));
        listOfStudents.add(new Student("Teodor_Rusvelt", 21, "international politics"));
        listOfStudents.add(new Student("Eleonor_Rusvelt", 18, "literature"));
        listOfStudents.add(new Student("Ivan Zatesaylo", 22, "math"));

        System.out.println(listOfStudents);
        }
    }

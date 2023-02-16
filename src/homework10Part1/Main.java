package homework10Part1;

import java.util.Scanner;

//1. Створити клас, який описує студента та клас для опису викладача
//2. Створити клас для роботи с масивом чисел. Він повинен вміти:
//— створювати масив з випадковими числами с заданим розміром
//— сортувати масив у дві сторони
//— вивести на консоль масив
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int arraySize = scanner.nextInt();
        WorkingWithNumbers.increaseSorting(WorkingWithNumbers.creatingArray(arraySize));
//        WorkingWithNumbers.decreasingSorting(WorkingWithNumbers.creatingArray(arraySize));
    }
}

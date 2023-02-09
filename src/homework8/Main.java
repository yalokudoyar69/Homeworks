package homework8;

import java.util.Random;

public class Main {

//    Створити програму в якій потрібно створити масив з 10 елементів та заповнити його випадковими числами
//    Вивести його на консоль
//    Знайти мінімальне значення
//    Знайти максимальне значення
//    Знайти середнє значення
//    Знайти суму всіх елементів

    public static void main(String[] args) {
        int length = 10;
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Найменшим значенням масиву є " + min);

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Найбільшим значенням масиву є " + max);

        int sum = 0;
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            average = (double) sum / length;
        }
        System.out.println("Середнім значенням масиву є " + average);

        int sumOfAllElements = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfAllElements = sumOfAllElements + arr[i];
        }
        System.out.println("Сума елементів масиву становить " + sumOfAllElements);
    }
}

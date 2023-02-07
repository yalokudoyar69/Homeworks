package homework5;

import java.util.Scanner;

public class Main {

    //====Знаходження БІЛЬШОГО з двох чисел====
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть 2 числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Найбільшим числом є " + a);
        } else if (a == b) {
            System.out.println("Числа рівні");
        } else {
            System.out.println("Найбільшим числом є " + b);
        }

        //====Знаходження МЕНШОГО з двох чисел====

        System.out.println("Введіть 2 числа:");
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        if (a1 < b1) {
            System.out.println("Найменшим числом є " + a1);
        }  else if (a1 == b1) {
            System.out.println("Числа рівні");
        } else {
            System.out.println("Найменшим числом є " + b1);
        }


        //Перевірка парності числа
        System.out.println("Введіть число:");
        int a2 = scanner.nextInt();
        if(a2 % 2 == 0)
            System.out.println(a2 + " є парним");
        else
            System.out.println(a2 + " є непарним");
    }
}


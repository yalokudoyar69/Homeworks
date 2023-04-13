package homework25;

//Запросити з консолі число і огорнути цей функціонал у блоки обробки винятків.
//При вводі замість числа  букв - показувати повідомлення про помилку на консоль.
//За допомогою нескінченного циклу - запитувати число з консолі - поки не отримаємо його без помилок.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validValue = false;
        int number = 0;

        while (!validValue) {
            System.out.println("Введіть число:");
            try {
                number = scanner.nextInt();
                validValue = true;
            } catch (InputMismatchException e) {
                System.out.println("Введені дані мають неправильний формат. Спробуйте ввести число.");
                scanner.next();
            }
        }
        System.out.println("Все зроблено правильно!");
    }
}

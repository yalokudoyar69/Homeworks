package homework26;

//Створити виняток, який викидається, коли число менше нуля.
// Створити функцію, яка приймає число і повертає його квадрат. Якщо число буде менше нуля, то викинути створений вийняток.

import java.util.Scanner;

public class Main {

        public static int squareCalculation(int number) throws NegNumberException {
            if (number < 0) {
                throw new NegNumberException();
            }
            return number * number;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число");
        int number = scanner.nextInt();
        try {
            int result = squareCalculation(number);
            System.out.println("Квадрат числа " + number + " = " + result);
        } catch (NegNumberException e) {
            System.out.println("Помилка - " + e.getMessage());
    }
    }
}

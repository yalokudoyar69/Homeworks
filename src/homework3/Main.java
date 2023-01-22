package homework3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть 2 числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int addition = a + b;
        int subtraction = a - b;
        int division = a / b;
        int multiplication = a * b;
        System.out.println("Результат додавання\t\t" + a + " + " + b + " = " + addition);
        System.out.println("Результат віднімання\t" + a + " - " + b + " = " + subtraction);
        System.out.println("Результат ділення\t\t" + a + " / " + b + " = " + division);
        System.out.println("Результат ділення\t\t" + a + " * " + b + " = " + multiplication);
    }
}

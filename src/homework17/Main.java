package homework17;

//Створити метод - який за номером від 1 до 7 повертає день тижня, якому цей номер відповідає.

import java.util.Scanner;

import static homework17.DaysOfWeek.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число:");
        System.out.println(Days.getDays(scanner.nextInt()));
    }
}

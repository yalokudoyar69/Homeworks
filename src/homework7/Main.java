package homework7;

//1. Створити метод який повертає куб заданого числа
//2. Метод повинен вивести зірочку стільки разів, скільки передав користувач у метод
//3. Метод повинен вивести переданий символ стільки разів, скільки передав користувач у метод

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int b = scanner.nextInt();
        int c;
        c = cubeOfX(b);
        System.out.println("Кубом числа є " + c);
        printingSymbolsOfGivenN(b, "*");
        printingSymbolsOfGivenN(b);
    }

    static int cubeOfX(int b) {
        return b * b * b;
    }

    public static void printingSymbolsOfGivenN(int b, String symbol) {
        for (int i = 0; i < b; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    public static void printingSymbolsOfGivenN(int b) {
        for (int i = 0; i < b; i++) {
            System.out.print(b);
        }
    }
}
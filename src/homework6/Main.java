package homework6;

public class Main {

    public static void main(String[] args) {

// Виведення чисел від 1 до 10

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

// Парні числа в діапазоні від 1 до 100

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();


// Факторіал числа 7

        int a = 1;
        for (int i = 1; i <=7; i++) {
            a *= i;
        }
        System.out.print(a);


// Виведення чисел Фібоначчі до 100 (значення самого числа не повинно перевищувати 100)

        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber = 1;
        while (nextNumber < 100) {
            if (firstNumber == 0) {
                System.out.print(firstNumber + ", ");
            }
            System.out.print(nextNumber + ", ");
            nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }

    }
}
package homework32;

//Створити 2 потоки, які паралельно виводять на консоль числа від 1 до 10 та пишуть назву потоку.

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Threading ("Thread A"));
        Thread thread2 = new Thread(new Threading ("Thread B"));
        thread1.start();
        thread2.start();
    }
}

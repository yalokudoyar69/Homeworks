package homework33;

//Створити потік, який генерує числа від 1 до 10 і нескінченно їх виводить на консоль.
//Якщо згенероване число == 5 - то перервати роботу потоку

public class Main {
    public static void main(String[] args) {
        ThreadForNumbers thrd = new ThreadForNumbers();
        thrd.start();
    }
}
